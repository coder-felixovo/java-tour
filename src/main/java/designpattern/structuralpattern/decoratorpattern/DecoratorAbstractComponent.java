package designpattern.structuralpattern.decoratorpattern;

/**
 * 抽象组件，可以是一个接口或者抽象类，作为被装饰类的原始对象，规定被装饰对象的原始行为
 */
public interface DecoratorAbstractComponent {
    void doSomething();
}
