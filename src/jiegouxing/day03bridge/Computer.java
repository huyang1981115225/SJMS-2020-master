package jiegouxing.day03bridge;

/**
 * 电脑类型
 *
 * @author HuYang
 * @date 2019-11-01 13:50
 */
public interface Computer {

    /**
     * 销售电脑
     */
    void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机...");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本...");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑...");
    }
}

class LenovoDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售联想牌台式机...");
    }
}

class LenovoLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售联想牌笔记本...");
    }
}

class LenovoPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售联想牌平板电脑...");
    }
}

class DellDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售戴尔牌台式机...");
    }
}

class DellLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售戴尔牌笔记本...");
    }
}

class DellPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售戴尔牌平板电脑...");
    }
}

class ShenZhouDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售神舟牌台式机...");
    }
}

class ShenZhouLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售神舟牌笔记本...");
    }
}

class ShenZhouPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售神舟牌平板电脑...");
    }
}