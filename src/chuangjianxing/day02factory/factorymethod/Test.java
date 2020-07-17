package chuangjianxing.day02factory.factorymethod;

/**
 * 工厂方法模式：
 * 基于抽象工厂扩展具体工厂然后创建对象
 *
 * @author HuYang
 * @date 2019-10-31 15:09
 */
public class Test {

    public static void main(String[] args) {

        // 调用者需要和实现类打交道
        Car audi = new AudiFactory().createCar();
        audi.run();

        Car ferrari = new FerrariFactory().createCar();
        ferrari.run();

        // 假如想要新增一辆奔驰
        Car benz = new BenzFactory().createCar();
        benz.run();
    }
}
