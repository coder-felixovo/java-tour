package designpattern.behavioralpattern.mementopattern;

import org.junit.Test;

public class MementoPatternTest {
    @Test
    public void client1() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("a");
        System.out.println("Current state: " + originator.getState());
        caretaker.setMemento(originator.createMemento());

        originator.setState("b");
        System.out.println("Current state: " + originator.getState());
        caretaker.setMemento(originator.createMemento());

        originator.setState("c");
        System.out.println("Current state: " + originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Refresh state, current state: " + originator.getState());
    }
}
