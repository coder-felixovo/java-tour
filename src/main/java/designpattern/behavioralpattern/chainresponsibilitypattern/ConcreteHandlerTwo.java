package designpattern.behavioralpattern.chainresponsibilitypattern;

/**
 * 具体处理者 Concrete Handler
 */
public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("Concrete handler two handles the request.");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("Two: No handler can handle the request.");
            }
        }
    }
}
