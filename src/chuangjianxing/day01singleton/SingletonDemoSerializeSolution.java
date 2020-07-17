package chuangjianxing.day01singleton;

import java.io.*;

/**
 * 如何防止反序列化破解单例模式？
 *
 * @author HuYang
 * @date 2019-10-31 14:25
 */
public class SingletonDemoSerializeSolution implements Serializable {

    private static final long serialVersionUID = -5098099895120809474L;

    private static SingletonDemoSerializeSolution instance;

    private SingletonDemoSerializeSolution() {
    }

    public static synchronized SingletonDemoSerializeSolution getInstance() {
        if (instance == null) {
            instance = new SingletonDemoSerializeSolution();
        }
        return instance;
    }

    /**
     * 如何防止反序列化破解单例模式？
     * 加入 readResolve()
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        System.out.println("想过要反序列化破解单例模式？哈哈想多了哦！");
        return instance;
    }

    /**
     * 继续使用反序列化破解单例模式，这里会破处异常，破解失败！！！
     *
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonDemoSerializeSolution s1 = SingletonDemoSerializeSolution.getInstance();
        SingletonDemoSerializeSolution s2 = SingletonDemoSerializeSolution.getInstance();
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);

        // 序列化对象
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        // 反序列化对象
        FileInputStream fis = new FileInputStream("D:\\b.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemoSerializeSolution s3 = (SingletonDemoSerializeSolution) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("s3:  " + s3);

        // true  不加readResolve这里就是false
        System.out.println(s1 == s3);
    }
}
