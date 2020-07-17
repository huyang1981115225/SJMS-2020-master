package bat.chuangjianxing.day03builder;

/**
 * 具体建造者(Concrete Builder）：
 * 实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 *
 * @author huyang
 * @date 2020/7/17 11:12
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    public void buildPartB() {
        product.setPartA("建造 PartB");
    }

    public void buildPartC() {
        product.setPartA("建造 PartC");
    }
}
