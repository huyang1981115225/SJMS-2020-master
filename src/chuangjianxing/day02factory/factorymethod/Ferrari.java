package chuangjianxing.day02factory.factorymethod;

/**
 * 具体产品对象
 *
 * @author HuYang
 * @date 2019-10-31 15:07
 */
public class Ferrari implements Car {
    @Override
    public void run() {
        System.out.println("Hello I'm Ferrari 458!");
    }
}
