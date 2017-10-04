package design_pattern.structural.proxy.dynamic_proxy;

/**
 * Created by Cicinnus on 2017/10/2.
 */
public class RealRequestA implements AbstractRequest {
    @Override
    public void request() {
        System.out.println("请求A");
    }
}
