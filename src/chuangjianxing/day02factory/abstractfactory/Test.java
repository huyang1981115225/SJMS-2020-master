package chuangjianxing.day02factory.abstractfactory;

/**
 * @author HuYang
 * @date 2019-10-31 15:34
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 定制一辆高端车
         */
        CarFactory highCarFactory = new HighCarFactory();

        // 定制高端发动机
        CarEngine highEngine = highCarFactory.createCarEngine();
        highEngine.introduce();

        // 定制高端座椅
        CarSeat highSeat = highCarFactory.createCarSeat();
        highSeat.introduce();

        // 定制高端轮椅
        CarTyre highTyre = highCarFactory.createCarTyre();
        highTyre.introduce();
    }
}
