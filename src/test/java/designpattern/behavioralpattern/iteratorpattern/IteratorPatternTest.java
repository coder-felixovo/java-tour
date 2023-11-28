package designpattern.behavioralpattern.iteratorpattern;

import org.junit.Test;

public class IteratorPatternTest {
    @Test
    public void client() {
        Container strContainer = new MyContainer();
        strContainer.put("Amy");
        strContainer.put("Brown");
        strContainer.put("Cindy");

        Iterator myIterator = strContainer.iterator();

        System.out.println(myIterator.first());

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
