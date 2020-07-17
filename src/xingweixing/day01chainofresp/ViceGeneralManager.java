package xingweixing.day01chainofresp;

/**
 * 模拟副总经理
 *
 * @author HuYang
 * @date 2019-11-04 15:16
 */
public class ViceGeneralManager extends Leader {

    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 20) {
            System.out.println("员工" + leaveRequest.getName() + "想请" + leaveRequest.getLeaveDays() + "假,理由："
                    + leaveRequest.getReason());
            System.out.println("副总经理" + this.name + "审批通过。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
