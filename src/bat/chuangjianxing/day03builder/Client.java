package bat.chuangjianxing.day03builder;

/**
 * 客户端
 *
 * @author huyang
 * @date 2020/7/17 11:13
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
