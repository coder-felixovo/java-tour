package designpattern.structuralpattern.flyweightpattern;

import org.junit.Test;

public class FlyweightPatternTest {
    @Test
    public void test1() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight("a");
        Flyweight f2 = factory.getFlyweight("a");
        Flyweight f3 = factory.getFlyweight("b");

        f1.operation(new UnsharedConcreteFlyweight("第1次调用a"));
        f2.operation(new UnsharedConcreteFlyweight("第2次调用a"));
        f3.operation(new UnsharedConcreteFlyweight("第1次调用b"));
    }
}
