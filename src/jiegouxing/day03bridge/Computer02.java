package jiegouxing.day03bridge;

/**
 * @author HuYang
 * @date 2019-11-01 14:03
 */
public class Computer02 {

    protected Brand brand;

    public Computer02(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

class Desktop02 extends Computer02 {


    public Desktop02(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机...");
    }
}

class Laptop02 extends Computer02 {

    public Laptop02(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本...");
    }
}

class Pad02 extends Computer02 {

    public Pad02(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板电脑...");
    }
}