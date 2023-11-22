package designpattern.structuralpattern.proxypattern.staticproxy;

/**
 * Real Subject 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问Real Subject的方法");
    }
}
