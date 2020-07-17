package chuangjianxing.day02factory.simplefactory;

/**
 * 简单工厂模式
 *
 * @author HuYang
 * @date 2019-10-31 14:53
 */
public class Test02CarFactory01 {

    public static void main(String[] args) {

        // 调用者可以直接和车工厂打交道就可以了，具体工厂怎么造车不需要管
        Car audi = CarFactory01.createCar("audi");
        audi.run();

        Car ferrari = CarFactory01.createCar("ferrari");
        ferrari.run();
    }
}
