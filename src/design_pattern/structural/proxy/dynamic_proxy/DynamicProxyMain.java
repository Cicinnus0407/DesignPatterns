package design_pattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Cicinnus on 2017/10/2.
 * 动态代理
 */
public class DynamicProxyMain {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new DynamicProxy(new RealRequestA());
        AbstractRequest abstractRequest;
        abstractRequest = (AbstractRequest) Proxy.newProxyInstance(AbstractRequest.class.getClassLoader(), new Class[]{AbstractRequest.class}, invocationHandler);
        abstractRequest.request();

        System.out.println("\n");

        invocationHandler=new DynamicProxy(new RealRequestB());
        abstractRequest=(AbstractRequest)Proxy.newProxyInstance(AbstractRequest.class.getClassLoader(), new Class[]{AbstractRequest.class}, invocationHandler);
        abstractRequest.request();
    }
}
