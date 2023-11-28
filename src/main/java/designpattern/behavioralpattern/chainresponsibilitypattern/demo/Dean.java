package designpattern.behavioralpattern.chainresponsibilitypattern.demo;

/**
 * 具体处理者 Concrete Handler --- Dean
 */
public class Dean extends Leader{
    @Override
    public void handleRequest(float leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("Dean approved you to leave for " + leaveDays + " days.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("Dean: No one can approve a leave.");
            }
        }
    }
}
