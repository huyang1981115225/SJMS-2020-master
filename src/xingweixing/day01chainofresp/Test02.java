package xingweixing.day01chainofresp;

/**
 * @author HuYang
 * @date 2019-11-04 16:31
 */
public class Test02 {

    public static void main(String[] args) {

        Leader director = new Director("赵主任");
        Leader manager = new Manager("钱经理");

        // 假设新招了一个副总经理
        Leader viceGeneralManager = new ViceGeneralManager("李副总");

        Leader generalManager = new GeneralManager("孙总");

        // 组织责任链对象的关系
        director.setNextLeader(manager);
        manager.setNextLeader(viceGeneralManager);
        viceGeneralManager.setNextLeader(generalManager);

        // 模拟请假操作
        LeaveRequest request = new LeaveRequest("Tom", 15, "旅游");
        director.handleRequest(request);
    }
}
