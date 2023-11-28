package designpattern.behavioralpattern.chainresponsibilitypattern;

import org.junit.Test;

public class ChainOfResponsibilityTest {
    @Test
    public void client1() {
        Handler handler = new ConcreteHandlerOne();
        handler.handleRequest(1);
    }

    @Test
    public void client2() {
        Handler handler = new ConcreteHandlerOne();
        handler.handleRequest(2);
    }

    @Test
    public void client3() {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        handler1.setNext(handler2);
        handler1.handleRequest(2);
    }

    @Test
    public void client4() {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        handler1.setNext(handler2);
        handler1.handleRequest(3);
    }
}
