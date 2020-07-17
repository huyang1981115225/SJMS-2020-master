package chuangjianxing.day02factory.simplefactory;

/**
 * 没有使用简单工厂
 *
 * @author HuYang
 * @date 2019-10-31 14:45
 */
public class Test01NoFactory {
    public static void main(String[] args) {

        // 调用者需要知道接口类型的同时，也要知道实现类的类型
        Car audi = new Audi();
        audi.run();

        Car ferrari = new Ferrari();
        ferrari.run();
    }
}