package chuangjianxing.day02factory.factorymethod;

/**
 * @author HuYang
 * @date 2019-10-31 15:13
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
