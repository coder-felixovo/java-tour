package designpattern.behavioralpattern.mediatorpattern;

import org.junit.Test;

public class MediatorPatternTest {
    @Test
    public void client1() {
        Mediator mediator = new ConcreteMediator();

        Colleague c1 = new ConcreteColleagueOne();
        Colleague c2 = new ConcreteColleagueTwo();

        mediator.register(c1);
        mediator.register(c2);

        c1.send();

        System.out.println("----------");

        c2.send();
    }
}
