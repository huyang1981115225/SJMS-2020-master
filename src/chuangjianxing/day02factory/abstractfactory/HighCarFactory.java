package chuangjianxing.day02factory.abstractfactory;

/**
 * 具体工厂（Concrete Factory）：
 * 主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 *
 * 具体工厂对象 高端车工厂
 *
 * @author HuYang
 * @date 2019-10-31 15:26
 */
public class HighCarFactory implements CarFactory {
    @Override
    public CarEngine createCarEngine() {
        return new CarHighEngine();
    }

    @Override
    public CarSeat createCarSeat() {
        return new CarHighSeat();
    }

    @Override
    public CarTyre createCarTyre() {
        return new CarHighTyre();
    }
}
