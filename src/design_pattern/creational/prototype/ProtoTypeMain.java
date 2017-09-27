package design_pattern.creational.prototype;

import java.io.IOException;

/**
 * Created by Cicinnus on 2017/9/26.
 */
public class ProtoTypeMain {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Address address = new Address();
        address.setAddressName("广州");
        c1.setName("张三");
        c1.setAge(22);
        c1.setAddress(address);
        Customer c2 = c1.clone();

        System.out.println("客户的地址对象是否相同?" + (c1.getAddress() == c2.getAddress()));
        System.out.println("客户对象是否相同?" + (c1 == c2));

        CustomerDeepClone customerDeepClone1 = new CustomerDeepClone();
        AddressDeepClone addressDeepClone = new AddressDeepClone();
        addressDeepClone.setAddressName("上海");
        customerDeepClone1.setName("李四");
        customerDeepClone1.setAge(24);
        customerDeepClone1.setAddress(addressDeepClone);
        try {
            CustomerDeepClone customerDeepClone2 = customerDeepClone1.deepClone();
            System.out.println("深度克隆客户的'地址'对象是否相同?" + (customerDeepClone1.getAddress() == customerDeepClone2.getAddress()));
            System.out.println("深度克隆客户对象是否相同?" + (customerDeepClone1 == customerDeepClone2));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
