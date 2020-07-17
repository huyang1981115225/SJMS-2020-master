package xingweixing.day01chainofresp;

/**
 * 模拟主任
 *
 * @author HuYang
 * @date 2019-11-04 15:16
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println("员工" + leaveRequest.getName() + "想请" + leaveRequest.getLeaveDays() + "假,理由："
                    + leaveRequest.getReason());
            System.out.println("主任" + this.name + "审批通过。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
