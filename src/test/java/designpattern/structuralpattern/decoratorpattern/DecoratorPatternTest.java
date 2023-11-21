package designpattern.structuralpattern.decoratorpattern;

import org.junit.Test;

public class DecoratorPatternTest {
    @Test
    public void test1() {
        DecoratorAbstractComponent component = new DecoratorConcreteComponent();
        component.doSomething();
        System.out.println("----------");
        DecoratorAbstractComponent componentA = new DecoratorA(component);
        componentA.doSomething();
        System.out.println("----------");
    }
}
