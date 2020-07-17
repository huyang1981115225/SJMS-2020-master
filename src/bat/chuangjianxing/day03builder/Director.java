package bat.chuangjianxing.day03builder;

/**
 * 指挥者（Director）：
 * 它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，
 * 在指挥者中不涉及具体产品的信息。
 *
 * @author huyang
 * @date 2020/7/17 11:13
 */
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
