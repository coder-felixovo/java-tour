package designpattern.behavioralpattern.visitorpattern;

import org.junit.Test;

public class VisitorPatternTest {
    @Test
    public void client1() {
        Zoo zoo = new Zoo();

        zoo.add(new LionSpot());
        zoo.add(new PandaSpot());

        zoo.accept(new StudentVisitor());

        System.out.println("----------");

        zoo.accept(new CommonVisitor());
    }
}
