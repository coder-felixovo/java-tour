package designpattern.structuralpattern.proxypattern.staticproxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject  = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问Real Subject之前的预处理");
    }

    public void postRequest() {
        System.out.println("访问Real Subject之后的预处理");
    }
}
