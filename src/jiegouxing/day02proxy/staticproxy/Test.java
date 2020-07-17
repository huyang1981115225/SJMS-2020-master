package jiegouxing.day02proxy.staticproxy;

/**
 * @author HuYang
 * @date 2019-11-01 11:53
 */
public class Test {
    public static void main(String[] args) {

        // 真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑，供代理对象调用
        Star realStar = new RealStar();

        // 代理角色：实现抽象角色，是真实角色的代理，通过真实的业务逻辑方法来实现抽象方法，并附加自己的操作
        Star proxyStar = new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
    }
}
