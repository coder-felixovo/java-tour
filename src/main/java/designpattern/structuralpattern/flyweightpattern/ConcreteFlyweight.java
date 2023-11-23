package designpattern.structuralpattern.flyweightpattern;

/**
 * 具体享元角色
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元：" + key + "被创建！");
    }

    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被创建！");
        System.out.println("非享元信息：" + outState.getInfo());
    }
}
