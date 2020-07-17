package chuangjianxing.day02factory.simplefactory;

/**
 * @author HuYang
 * @date 2019-10-31 14:57
 */
public class CarFactory02 {

    public static Car createAudi(){
        return new Audi();
    }

    public static Car createFerrari(){
        return new Ferrari();
    }

    // 想要新增车型直接在下面增加对应的方法即可，不需要改动以前的代码
}
