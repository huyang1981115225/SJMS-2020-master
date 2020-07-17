package bat.chuangjianxing.day01singleton;

/**
 * 单例模式四：静态内部类式
 * 线程安全，调用效率高，支持延时加载
 * @author huyang
 * @date 2020/7/12 11:07
 */
public class SingletonDemo4 {

    private SingletonDemo4(){

    }

    private static class SingletonClassInstance{
        private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.INSTANCE;
    }

    public static void main(String[] args) {

        SingletonDemo4 s1 = SingletonDemo4.getInstance();
        SingletonDemo4 s2 = SingletonDemo4.getInstance();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println(s1 == s2);
    }
}
