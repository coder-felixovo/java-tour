package designpattern.structuralpattern.proxypattern;

import designpattern.structuralpattern.proxypattern.cglibproxy.CglibProxyFactory;
import designpattern.structuralpattern.proxypattern.cglibproxy.CglibTrainStation;
import designpattern.structuralpattern.proxypattern.dynamicproxy.ProxyFactory;
import designpattern.structuralpattern.proxypattern.dynamicproxy.SellTickets;
import designpattern.structuralpattern.proxypattern.staticproxy.Proxy;
import org.junit.Test;

public class ProxyTest {

    // static proxy
    @Test
    public void test1() {
        Proxy proxy = new Proxy();
        proxy.Request();
    }

    // dynamic proxy
    @Test
    public void test2() {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }

    // cglib proxy
    @Test
    public void test3() {
        CglibProxyFactory factory = new CglibProxyFactory();
        CglibTrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
