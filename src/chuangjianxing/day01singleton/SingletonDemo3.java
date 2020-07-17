package chuangjianxing.day01singleton;

/**
 * 单例模式三
 * 双重检测锁：由于jvm底层内部模型问题，会出问题，不建议
 *
 * @author HuYang
 * @date 2019-10-31 11:59
 */
public class SingletonDemo3 {

    /**
     * 类初始化时,不初始化这个对象（延时加载，真正使用时才创建）
     */
    private static SingletonDemo3 instance;

    /**
     * 私有化构造方法
     */
    private SingletonDemo3() {
    }


    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 s;
            synchronized (SingletonDemo3.class) {
                s = instance;
                if (s == null) {
                    synchronized (SingletonDemo3.class) {
                        if (s == null) {
                            s = new SingletonDemo3();
                        }
                    }
                    instance = s;
                }
            }
        }
        return instance;
    }

    /**
     * 创建两个对象是否相同
     *
     * @param args
     */
    public static void main(String[] args) {

        SingletonDemo3 s1 = SingletonDemo3.getInstance();
        SingletonDemo3 s2 = SingletonDemo3.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);
    }
}
