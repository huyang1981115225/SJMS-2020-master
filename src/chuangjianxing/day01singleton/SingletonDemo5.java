package chuangjianxing.day01singleton;

/**
 * 单例模式五
 * 枚举：线程安全，调用效率高，但不支持延时加载
 *
 * @author HuYang
 * @date 2019-10-31 13:49
 */
public enum SingletonDemo5 {

    // 枚举元素，本身就是单例对象
    INSTANCE;

    /**
     * 可以自定义一些逻辑
     */
    public void dosomeThing() {
    }

    /**
     * 测试创建两个对象是否相同
     *
     * @param args
     */
    public static void main(String[] args) {

        SingletonDemo5 s1 = SingletonDemo5.INSTANCE;
        SingletonDemo5 s2 = SingletonDemo5.INSTANCE;
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);

        // true
        System.out.println(s1 == s2);
    }
}
