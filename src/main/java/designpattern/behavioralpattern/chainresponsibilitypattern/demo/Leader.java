package designpattern.behavioralpattern.chainresponsibilitypattern.demo;

/**
 * 抽象处理者 Handler --- Leader类
 */
public abstract class Leader {
    private Leader next;

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext() {
        return next;
    }

    public abstract void handleRequest(float leaveDays);
}
