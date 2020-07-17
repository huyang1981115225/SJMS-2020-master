package jiegouxing.day02proxy.staticproxy;

/**
 * 代理角色
 *
 * @author HuYang
 * @date 2019-11-01 11:50
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.面谈");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.面谈");
    }

    @Override
    public void sing() {
        // 这里可以添加一些其他操作
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.面谈");
    }
}
