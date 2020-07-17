package jiegouxing.day02proxy.dynamicproxy;

/**
 * 真实角色
 *
 * @author HuYang
 * @date 2019-11-01 11:49
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.面谈");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.订票");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.唱歌（核心业务）");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.收钱");
    }
}
