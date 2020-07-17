package chuangjianxing.day01singleton;

/**
 * 如何防止反射破解单例模式？
 *
 * @author HuYang
 * @date 2019-10-31 14:02
 */
public class SingletonDemoReflectSolution {

    private static SingletonDemoReflectSolution instance;

    /**
     * 防止反射破解单例解决方案：
     * 私有化构造方法的同时加入校验。
     */
    private SingletonDemoReflectSolution() {
        if (instance != null) {
            throw new RuntimeException("想用反射破解？哈哈想多了哦");
        }
    }

    public static synchronized SingletonDemoReflectSolution getInstance() {
        if (instance == null) {
            instance = new SingletonDemoReflectSolution();
        }
        return instance;
    }

    /**
     * 继续使用反射破解单例模式，发现无法破解
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        SingletonDemoReflectSolution s1 = SingletonDemoReflectSolution.getInstance();
        SingletonDemoReflectSolution s2 = SingletonDemoReflectSolution.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);

        // 使用反射创建对象并实例化  这里会抛出异常！！！破解单例模式失败
        Class<?> clazz = Class.forName("chuangjianxing.day01singleton.SingletonDemoReflectSolution");

        SingletonDemoReflectSolution s3 = (SingletonDemoReflectSolution) clazz.newInstance();
        SingletonDemoReflectSolution s4 = (SingletonDemoReflectSolution) clazz.newInstance();
        System.out.println("s3:  " + s3);
        System.out.println("s4:  " + s4);

        System.out.println(s3 == s4);
    }
}
