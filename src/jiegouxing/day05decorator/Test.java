package jiegouxing.day05decorator;

/**
 * @author HuYang
 * @date 2019-11-01 15:31
 */
public class Test {

    public static void main(String[] args) {

        // 一辆普通的车
        Car car = new Car();
        car.move();
        System.out.println("--------------------------------");

        // 装饰模式增加新的功能
        System.out.println("新开发飞行功能");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();;
        System.out.println("--------------------------------");

        System.out.println("新开发水上漂功能");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
        System.out.println("--------------------------------");

        System.out.println("新开发自动驾驶功能");
        AICar aiCar = new AICar(waterCar);
        aiCar.move();

    }
}
