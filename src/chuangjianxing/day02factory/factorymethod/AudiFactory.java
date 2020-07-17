package chuangjianxing.day02factory.factorymethod;

/**
 * 具体工厂对象
 *
 * @author HuYang
 * @date 2019-10-31 15:06
 */
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
