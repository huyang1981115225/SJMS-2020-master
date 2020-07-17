package chuangjianxing.day01singleton;

import java.io.*;

/**
 * 反序列化可以破解单例模式，这里以懒汉式为例
 *
 * @author HuYang
 * @date 2019-10-31 14:11
 */
public class SingletonDemoSerialize implements Serializable {

    private static final long serialVersionUID = -2728946733511645464L;

    private static SingletonDemoSerialize instance;

    private SingletonDemoSerialize() {
    }

    public static synchronized SingletonDemoSerialize getInstance() {
        if (instance == null) {
            instance = new SingletonDemoSerialize();
        }
        return instance;
    }

    /**
     * 演示反序列化可以破解单例模式
     *
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonDemoSerialize s1 = SingletonDemoSerialize.getInstance();
        SingletonDemoSerialize s2 = SingletonDemoSerialize.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);

        // 序列化对象
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        // 反序列化对象
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemoSerialize s3 = (SingletonDemoSerialize) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("s3:  " + s3);

        // false
        System.out.println(s1 == s3);
    }
}
