package xingweixing.day01chainofresp;

/**
 * 封装请假的基本信息
 *
 * @author HuYang
 * @date 2019-11-04 15:12
 */
public class LeaveRequest {

    private String name;

    private Integer leaveDays;

    private String reason;

    public LeaveRequest(String name, Integer leaveDays, String reason) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
