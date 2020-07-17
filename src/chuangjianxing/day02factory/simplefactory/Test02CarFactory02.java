package chuangjianxing.day02factory.simplefactory;

/**
 * @author HuYang
 * @date 2019-10-31 15:00
 */
public class Test02CarFactory02 {

    public static void main(String[] args) {

        // 调用者可以直接和车工厂打交道就可以了，具体工厂怎么造车不需要管
        Car audi = CarFactory02.createAudi();
        audi.run();;

        Car ferrari = CarFactory02.createFerrari();
        ferrari.run();
    }
}
