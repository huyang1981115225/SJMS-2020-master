package chuangjianxing.day01singleton;

/**
 * 反射可以破解单例模式：这里以懒汉式为例
 *
 * @author HuYang
 * @date 2019-10-31 13:54
 */
public class SingletonDemoReflect {

    /**
     * 类初始化时，立即加载这个对象（没有延时加载的优势），
     * 加载类时，天然的是线程安全的
     */
    private static SingletonDemoReflect instance;

    /**
     * 私有化构造方法
     */
    private SingletonDemoReflect() {
    }

    public static synchronized SingletonDemoReflect getInstance() {
        if (instance == null) {
            instance = new SingletonDemoReflect();
        }
        return instance;
    }

    /**
     * 演示反射破解单例模式
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        SingletonDemoReflect s1 = SingletonDemoReflect.getInstance();
        SingletonDemoReflect s2 = SingletonDemoReflect.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);

        // 使用反射创建对象并实例化
        Class<?> clazz = Class.forName("chuangjianxing.day01singleton.SingletonDemoReflect");

        SingletonDemoReflect s3 = (SingletonDemoReflect) clazz.newInstance();
        SingletonDemoReflect s4 = (SingletonDemoReflect) clazz.newInstance();
        System.out.println("s3:  " + s3);
        System.out.println("s4:  " + s4);

        // false
        System.out.println(s3 == s4);
    }
}
