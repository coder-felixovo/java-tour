package designpattern.structuralpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy 代理
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    // 使用Proxy获取代理对象
    /*
        newProxyInstance()方法参数说明
            ClassLoader loader: 类加载器，用于加载代理类，使用真实对象的类加载器即可
            Class<?>[] interfaces: 真实对象所实现的接口，代理模式真实对象和代理对象实现相同接口
            InvocationHandler h: 代理对象的调用处理程序
     */
    public SellTickets getProxyObject() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                /*
                    invoke方法参数说明
                        proxy 代理对象
                        method 在代理对象上调用的接口方法的 Method 实例
                        args 代理对象调用接口方法时传递的实际参数
                 */
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理点收取服务费用，JDK Dynamic Proxy");
                        Object result = method.invoke(station, args);
                        return result;
                    }
                }
        );
        return sellTickets;
    }
}
