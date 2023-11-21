package designpattern.structuralpattern.decoratorpattern;

/**
 * 具体组件，作为被装饰对象，实现或集成抽象组件的一组对象
 */
public class DecoratorConcreteComponent implements DecoratorAbstractComponent {
    @Override
    public void doSomething() {
        System.out.println("Decorator concrete component do something");
    }
}
