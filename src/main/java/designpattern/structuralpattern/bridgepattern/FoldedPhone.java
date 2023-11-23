package designpattern.structuralpattern.bridgepattern;

/**
 * 扩展抽象化（Refined Abstraction）角色，时抽象化角色的子类，实现父类中的业务方法，通过组合关系调用实现化角色中的业务方法。
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(PhoneBrand phoneBrand) {
        super(phoneBrand); // 调用父类构造器初始化
    }

    public void open() {
        super.open();
        System.out.println("折叠式手机 open");
    }

    public void close() {
        super.close();
        System.out.println("折叠式手机 close");
    }

    public void call() {
        super.call();
        System.out.println("折叠式手机 call");
    }
}
