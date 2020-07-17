package xingweixing.day01chainofresp;

/**
 * 模拟总经理
 *
 * @author HuYang
 * @date 2019-11-04 15:16
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 30) {
            System.out.println("员工" + leaveRequest.getName() + "想请" + leaveRequest.getLeaveDays() + "假,理由："
                    + leaveRequest.getReason());
            System.out.println("总经理" + this.name + "审批通过。");
        } else {
            System.out.println("莫非" + leaveRequest.getName() + "不想干了，竟然想请假" + leaveRequest.getLeaveDays() + "天。");
        }
    }
}
