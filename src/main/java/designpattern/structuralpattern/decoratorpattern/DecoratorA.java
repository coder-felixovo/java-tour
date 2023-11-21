package designpattern.structuralpattern.decoratorpattern;

/**
 * 具体装饰器，作为装饰器的具体实现类
 */
public class DecoratorA extends AbstractDecorator {
    public DecoratorA(DecoratorAbstractComponent decoratorAbstractComponent) {
        super(decoratorAbstractComponent);
    }

    @Override
    public void doSomething() {
        super.decoratorAbstractComponent.doSomething();
        System.out.println("Decorator A helps to do something");
    }
}
