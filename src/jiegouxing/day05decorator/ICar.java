package jiegouxing.day05decorator;

/**
 * 抽象构件角色：Component
 *
 * @author HuYang
 * @date 2019-11-01 15:25
 */
public interface ICar {

    /**
     * 移动
     */
    void move();
}

/**
 * 具体构件角色：ConcreteComponent
 */
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地上跑...");
    }
}

/**
 * 装饰角色
 */
class SuperCar implements ICar{

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
       car.move();
    }
}

/**
 * 具体装饰角色：ConcreteDecorator
 */
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞...");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * 具体装饰角色：ConcreteDecorator
 */
class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上漂...");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

/**
 * 具体装饰角色：ConcreteDecorator
 */
class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动驾驶...");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
