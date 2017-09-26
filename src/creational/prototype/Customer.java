package creational.prototype;

/**
 * Created by Cicinnus on 2017/9/26.
 */
public class Customer implements Cloneable {
    private String name;
    private int age;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //浅克隆方法,只能复制基本类型
    public Customer clone() {
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
