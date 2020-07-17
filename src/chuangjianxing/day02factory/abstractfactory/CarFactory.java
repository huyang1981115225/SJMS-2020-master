package chuangjianxing.day02factory.abstractfactory;

/**
 * 抽象工厂：
 * 提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
 *
 * @author HuYang
 * @date 2019-10-31 15:27
 */
public interface CarFactory {

    /**
     * 制造汽车发动机
     * @return
     */
    CarEngine createCarEngine();

    /**
     * 制造汽车座椅
     * @return
     */
    CarSeat createCarSeat();

    /**
     * 制造汽车轮胎
     * @return
     */
    CarTyre createCarTyre();
}
