package bat.chuangjianxing.day01singleton;

/**
 * 单例模式二：懒汉式
 * 线程安全，调用效率低，但是支持延时加载
 *
 * @author huyang
 * @date 2020/7/12 11:00
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2(){

    }

    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null){
            instance = new SingletonDemo2();
        }

        return instance;
    }

    public static void main(String[] args) {

        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();

        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        System.out.println(s1 == s2);
    }
}
