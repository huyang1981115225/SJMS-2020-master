package jiegouxing.day03bridge;

/**
 * @author HuYang
 * @date 2019-11-01 14:21
 */
public class Test02Bridge {

    public static void main(String[] args) {

        // 销售联想的笔记本电脑
        Computer02 c1 = new Laptop02(new Lenovo());
        c1.sale();

        // 销售戴尔平板电脑
        Computer02 c2 = new Pad02(new Dell());
        c2.sale();

        // 销售神舟台式机
        Computer02 c3 = new Desktop02(new ShenZhou());
        c3.sale();
    }
}
