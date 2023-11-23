package designpattern.structuralpattern.bridgepattern;

/**
 * 具体实现化（Concrete Implementor）角色
 */
public class Xiaomi implements PhoneBrand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
