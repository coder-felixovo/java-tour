package designpattern.behavioralpattern.chainresponsibilitypattern;

/**
 * 抽象处理者 Handler
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handleRequest(int request);
}
