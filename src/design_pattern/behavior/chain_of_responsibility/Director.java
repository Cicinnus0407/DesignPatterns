package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 * 主任
 */
public class Director extends Approver {

    public Director(String processName) {
        super(processName);
    }

    @Override
    public void processRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 3) {
            System.out.println(String.format("%s主任批准%s请%s天假", processName,leaveRequest.getName(),leaveRequest.getDay()));

        } else {
            //转发请求
            nextApprover.processRequest(leaveRequest);
        }
    }
}
