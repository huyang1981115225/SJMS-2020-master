package chuangjianxing.day02factory.simplefactory;

/**
 * 简单工厂模式：
 * <p>
 * 1）一般也称为静态工厂模式，工厂类常常使用静态方法，通过接收不同的参数来返回不同的对象实例
 * <p>
 * 2）想要新增新的产品，需要改动原有代码
 *
 * @author HuYang
 * @date 2019-10-31 14:47
 */
public class CarFactory01 {

    private static String type1 = "audi";

    private static String type2 = "ferrari";

    public static Car createCar(String type) {
        if (type1.equals(type)) {
            return new Audi();
        } else if (type2.equals(type)) {
            return new Ferrari();
        } else {
            return null;
        }
    }
}
