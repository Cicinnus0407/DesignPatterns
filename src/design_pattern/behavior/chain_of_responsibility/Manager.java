package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 * 经理批准大于3天小于10天的假
 */
public class Manager extends Approver {
    public Manager(String processName) {
        super(processName);
    }

    @Override
    public void processRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay()<10) {
            System.out.println(String.format("%s经理批准%s请%s天假",processName,leaveRequest.getName(),leaveRequest.getDay()));
        }else{
            this.nextApprover.processRequest(leaveRequest);
        }
    }
}
