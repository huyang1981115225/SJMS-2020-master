package bat.chuangjianxing.day01singleton;

/**
 * 单例模式一：饿汉式
 * 线程安全，调用效率高，但是不支持延时加载
 *
 * @author huyang
 * @date 2020/7/12 10:54
 */
public class SingletonDemo1 {

    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo1 s1 = SingletonDemo1.getInstance();

        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println("s1： " + s1);
        System.out.println("s2:  " + s2);

        System.out.println(s1 == s2);
    }
}
