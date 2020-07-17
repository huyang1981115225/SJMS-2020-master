package chuangjianxing.day02factory.simplefactory;

/**
 * 具体产品对象
 *
 * @author HuYang
 * @date 2019-10-31 14:42
 */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("Hello I'm Audi R8!");
    }
}
