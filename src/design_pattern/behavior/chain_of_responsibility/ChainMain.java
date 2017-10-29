package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 */
public class ChainMain {
    public static void main(String[] args) {
        LeaveRequest leaveRequest1 = new LeaveRequest(2,"哈哈");
        LeaveRequest leaveRequest2 = new LeaveRequest(15,"呵呵");
        LeaveRequest leaveRequest3 = new LeaveRequest(40,"嘿嘿");

        Approver director = new Director("张三");
        Approver manager = new Manager("李四");
        Approver generalManager = new GeneralManager("王五");

        director.setNextApprover(manager);
        manager.setNextApprover(generalManager);
        director.processRequest(leaveRequest1);
        director.processRequest(leaveRequest2);
        director.processRequest(leaveRequest3);


    }
}
