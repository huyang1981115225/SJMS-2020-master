package xingweixing.day01chainofresp;

/**
 * @author HuYang
 * @date 2019-11-04 15:11
 */
public abstract class Leader {

    protected String name;

    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest leaveRequest);

}
