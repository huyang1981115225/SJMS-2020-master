package chuangjianxing.day01singleton;

/**
 * 单例模式二
 * 懒汉式：线程安全，调用效率低，但是支持延时加载。
 *
 * @author HuYang
 * @date 2019-10-31 11:47
 */
public class SingletonDemo2 {

    /**
     * 类初始化时,不初始化这个对象（延时加载，真正使用时才创建）
     */
    private static SingletonDemo2 instance;

    /**
     * 私有化构造方法
     */
    private SingletonDemo2() {
    }

    /**
     * 方法需要同步synchronized，调用效率低。
     *
     * @return
     */
    public static synchronized SingletonDemo2 getInstance() {

        if (instance == null) {
            instance = new SingletonDemo2();
        }

        return instance;
    }

    /**
     * 测试创建两个对象是否相同
     *
     * @param args
     */
    public static void main(String[] args) {

        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);
    }
}
