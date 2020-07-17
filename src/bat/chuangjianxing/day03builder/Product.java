package bat.chuangjianxing.day03builder;

/**
 * 产品角色（Product）：
 * 它是包含多个组成部件的复杂对象，由具体建造者来创建其各个零部件。
 *
 * @author huyang
 * @date 2020/7/17 11:11
 */
class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        //显示产品的特性
    }
}