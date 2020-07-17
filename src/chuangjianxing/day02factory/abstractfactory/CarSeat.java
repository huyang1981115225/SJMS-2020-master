package chuangjianxing.day02factory.abstractfactory;

/**
 * 抽象产品对象
 *
 * @author HuYang
 * @date 2019-10-31 15:19
 */
public interface CarSeat {

    void introduce();
}

/**
 * 具体产品对象
 */
class CarHighSeat implements CarSeat{

    @Override
    public void introduce() {
        System.out.println("高端汽车座椅");
    }
}

/**
 * 具体产品对象
 */
class CarLowSeat implements CarSeat{

    @Override
    public void introduce() {
        System.out.println("低端汽车座椅");
    }
}
