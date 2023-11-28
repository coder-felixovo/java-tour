package designpattern.behavioralpattern.chainresponsibilitypattern;

/**
 * 具体处理者 Concrete Handler
 */
public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("Concrete handler one handles the request.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("One: No handler can handle the request.");
            }
        }
    }
}
