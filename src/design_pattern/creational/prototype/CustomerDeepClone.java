package design_pattern.creational.prototype;

import java.io.*;

/**
 * Created by Cicinnus on 2017/9/26.
 * 允许深度克隆的Customer对象
 */
public class CustomerDeepClone implements AbstractCustomer, Serializable {
    private String name;
    private int age;
    private AddressDeepClone address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressDeepClone getAddress() {
        return address;
    }

    public void setAddress(AddressDeepClone address) {
        this.address = address;
    }


    @Override
    public AbstractCustomer clone() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bao.toByteArray());
            ois = new ObjectInputStream(bis);
            return (AbstractCustomer) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println("CustomerDeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}');
    }
}
