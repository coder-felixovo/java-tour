package designpattern.structuralpattern.flyweightpattern;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
