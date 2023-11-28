package designpattern.behavioralpattern.chainresponsibilitypattern.demo;

/**
 * 具体处理者 Concrete Handler --- ClassAdviser
 */
public class ClassAdviser extends Leader {
    @Override
    public void handleRequest(float leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("Class adviser approved you to leave for " + leaveDays + " days.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("ClassAdviser: No one can approve a leave.");
            }
        }
    }
}
