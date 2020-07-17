package chuangjianxing.day02factory.simplefactory;

/**
 * 具体产品对象
 *
 * @author HuYang
 * @date 2019-10-31 14:43
 */
public class Ferrari implements Car {

    @Override
    public void run() {
        System.out.println("Hello I'm Ferrari 458!");
    }
}
