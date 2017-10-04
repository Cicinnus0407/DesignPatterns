package design_pattern.structural.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Cicinnus on 2017/10/2.
 */
public class DynamicProxy implements InvocationHandler {

    private AbstractRequest obj;

    public DynamicProxy(AbstractRequest obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        if (obj != null) {
            method.invoke(obj,args);
        }else {
            System.out.println("动态代理对象为null");
        }
        postRequest();
        return null;
    }

    private void preRequest() {
        System.out.println("------请求前添加操作------");
    }
    private void postRequest(){
        System.out.println("------请求后添加操作------");
    }

    public void setAbstractRequest(AbstractRequest abstractRequest) {
        this.obj = abstractRequest;
    }

}
