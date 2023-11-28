package designpattern.behavioralpattern.chainresponsibilitypattern.demo;

/**
 * 具体处理者 Concrete Handler --- DepartmentHead
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(float leaveDays) {
        if (leaveDays <= 5) {
            System.out.println("Department head approved you to leave for " + leaveDays + " days.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("DepartmentHead: No one can approve a leave.");
            }
        }
    }
}
