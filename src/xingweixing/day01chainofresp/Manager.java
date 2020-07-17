package xingweixing.day01chainofresp;

/**
 * 模拟经理
 *
 * @author HuYang
 * @date 2019-11-04 15:16
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println("员工" + leaveRequest.getName() + "想请" + leaveRequest.getLeaveDays() + "假,理由："
                    + leaveRequest.getReason());
            System.out.println("经理" + this.name + "审批通过。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
