package chuangjianxing.day02factory.abstractfactory;

/**
 * 抽象产品对象
 *
 * @author HuYang
 * @date 2019-10-31 15:21
 */
public interface CarTyre {

    void introduce();
}

/**
 * 具体产品对象
 */
class CarHighTyre implements CarTyre{

    @Override
    public void introduce() {
        System.out.println("高端汽车轮胎");
    }
}

/**
 * 具体产品对象
 */
class CarLowTyre implements CarTyre{

    @Override
    public void introduce() {
        System.out.println("低端汽车轮胎");
    }
}
