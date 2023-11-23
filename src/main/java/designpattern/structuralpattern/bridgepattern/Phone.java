package designpattern.structuralpattern.bridgepattern;

/**
 * 抽象化（Abstraction）角色，内部包含对实现化角色的引用
 */
public abstract class Phone {
    // 组合PhoneBrand接口
    private PhoneBrand phoneBrand;

    public Phone(PhoneBrand phoneBrand) {
        super();
        this.phoneBrand = phoneBrand;
    }

    // 调用接口里的方法，当该类的子类调用该类的方法时就会调用到接口里的方法
    protected void open() {
        phoneBrand.open();
    }

    protected void close() {
        phoneBrand.close();
    }

    protected void call() {
        phoneBrand.call();
    }
}
