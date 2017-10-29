package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 * 总经理
 */
public class GeneralManager extends Approver {

    public GeneralManager(String processName) {
        super(processName);
    }

    @Override
    public void processRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 30) {
            System.out.println(String.format("%s总经理批准%s请%s天假",processName, leaveRequest.getName(), leaveRequest.getDay()));
        } else {
            System.out.println("拒绝提交超过30天的请假申请");
        }
    }
}
