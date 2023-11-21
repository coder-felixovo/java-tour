package designpattern.structuralpattern.decoratorpattern;

/**
 * 具体装饰器，作为装饰器的具体实现类
 */
public class DecoratorB extends AbstractDecorator{
    public DecoratorB(DecoratorAbstractComponent decoratorAbstractComponent) {
        super(decoratorAbstractComponent);
    }

    @Override
    public void doSomething() {
        super.decoratorAbstractComponent.doSomething();
        System.out.println("Decorator B helps to do something.");
    }
}
