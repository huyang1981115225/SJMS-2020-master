package chuangjianxing.day01singleton;

/**
 * 单例模式四
 * 静态内部类：线程安全，调用效率高，支持延时加载。
 *
 * @author HuYang
 * @date 2019-10-31 12:05
 */
public class SingletonDemo4 {

    /**
     * 私有化构造方法
     */
    private SingletonDemo4() {
    }

    /**
     * 静态内部类
     */
    private static class SingletonClassInstance {

        // 定义一个常量
        private static final SingletonDemo4 INSTANCE = new SingletonDemo4();

    }

    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.INSTANCE;
    }


    /**
     * 创建两个对象是否相同
     *
     * @param args
     */
    public static void main(String[] args) {

        SingletonDemo4 s1 = SingletonDemo4.getInstance();
        SingletonDemo4 s2 = SingletonDemo4.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);
    }
}
