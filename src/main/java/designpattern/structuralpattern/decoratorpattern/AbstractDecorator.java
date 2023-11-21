package designpattern.structuralpattern.decoratorpattern;

/**
 * 抽象装饰器，作为具体组件的装饰器，一般情况下，是一个抽象类
 */
public abstract class AbstractDecorator implements DecoratorAbstractComponent{
    public DecoratorAbstractComponent decoratorAbstractComponent;
    public AbstractDecorator(DecoratorAbstractComponent decoratorAbstractComponent) {
        this.decoratorAbstractComponent = decoratorAbstractComponent;
    }
}
