package chuangjianxing.day02factory.factorymethod;

/**
 * 具体工厂对象
 *
 * @author HuYang
 * @date 2019-10-31 15:08
 */
public class FerrariFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ferrari();
    }
}
