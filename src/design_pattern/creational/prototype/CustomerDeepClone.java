package design_pattern.creational.prototype;

import java.io.*;

/**
 * Created by Cicinnus on 2017/9/26.
 * 允许深度克隆的Customer对象
 */
public class CustomerDeepClone implements Serializable{
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

    //深克隆,可以复制引用类型
    public CustomerDeepClone deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis  = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (CustomerDeepClone) ois.readObject();

    }

    @Override
    public String toString() {
        return "CustomerDeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
