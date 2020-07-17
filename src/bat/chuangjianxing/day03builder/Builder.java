package bat.chuangjianxing.day03builder;

/**
 * 抽象建造者（Builder）：
 * 它是一个包含创建产品各个子部件的抽象方法的接口，
 * 通常还包含一个返回复杂产品的方法 getResult()。
 *
 * @author huyang
 * @date 2020/7/17 11:12
 */
abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}