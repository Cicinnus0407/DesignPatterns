package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 * 抽象处理者
 */
public abstract class Approver {
    protected Approver nextApprover;
    protected String processName;//处理人名字

    public Approver(String processName) {
        this.processName = processName;
    }
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    //处理请假的抽象方法
    public abstract void processRequest(LeaveRequest leaveRequest);

}
