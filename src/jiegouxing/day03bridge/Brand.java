package jiegouxing.day03bridge;

/**
 * 品牌
 *
 * @author HuYang
 * @date 2019-11-01 13:47
 */
public interface Brand {

    /**
     * 销售品牌
     */
    void sale();
}

/**
 * 联想牌
 */
class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("Hello I'm Lenovo!");
    }
}

/**
 * 戴尔牌
 */
class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("Hello I'm Dell");
    }
}

/**
 * 神舟牌
 */
class ShenZhou implements Brand{

    @Override
    public void sale() {
        System.out.println("Hello I'm ShenZhou!");
    }
}
