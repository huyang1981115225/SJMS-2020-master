package xingweixing.day01chainofresp;

/**
 * @author HuYang
 * @date 2019-11-04 15:31
 */
public class Test01 {

    public static void main(String[] args) {

        Leader director = new Director("赵主任");
        Leader manager = new Manager("钱经理");
        Leader generalManager = new GeneralManager("孙经理");

        // 组织责任链对象的关系
        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);

        // 模拟请假操作
        LeaveRequest request = new LeaveRequest("Tom",32,"旅游");
        director.handleRequest(request);
    }
}
