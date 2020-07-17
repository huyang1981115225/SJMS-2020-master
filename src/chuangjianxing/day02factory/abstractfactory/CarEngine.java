package chuangjianxing.day02factory.abstractfactory;

/**
 * 抽象产品（Product）：
 * 定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 *
 * 抽象产品对象
 *
 * @author HuYang
 * @date 2019-10-31 15:17
 */
public interface CarEngine {

    void introduce();
}

/**
 * 具体产品（ConcreteProduct）：
 * 实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。
 *
 * 具体产品对象
 */
class CarHighEngine implements CarEngine{

    @Override
    public void introduce() {
        System.out.println("高端汽车发动机");
    }
}

/**
 * 具体产品对象
 */
class CarLowEngine implements CarEngine{

    @Override
    public void introduce() {
        System.out.println("低端汽车发动机");
    }
}
