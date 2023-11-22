package designpattern.structuralpattern.proxypattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private CglibTrainStation target = new CglibTrainStation();

    public CglibTrainStation getProxyObject() {
        // 创建Enhancer实例，类似于JDK动态代理的proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        CglibTrainStation obj = (CglibTrainStation) enhancer.create();
        return obj;
    }

    /*
        intercept方法参数说明
            o 代理对象
            method 真实对象中的方法Method实例
            objects 实际参数
            methodProxy 代理对象中的方法的method实例
     */
    @Override
    public CglibTrainStation intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取服务费用 CGLIB");
        CglibTrainStation result = (CglibTrainStation) methodProxy.invokeSuper(o, objects);
        return result;
    }
}
