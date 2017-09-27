package design_pattern.creational.prototype;

import java.io.Serializable;

/**
 * Created by Cicinnus on 2017/9/26.
 * 深度克隆的地址对象
 */
public class AddressDeepClone implements Serializable{
    private String addressName;

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
