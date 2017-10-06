package design_pattern.structural.adapter.sample2;

/**
 * Created by Cicinnus on 2017/10/6.
 */
public class Sample2Main {
    public static void main(String[] args) {
        //类适配器
        Socket socket = new ChargerAdapter();
        socket.supplyWith220V();

        //对象适配器
//        Computer computer = new Computer();
//        Socket socket2 = new Charger2Adapter(computer);
//        socket2.supplyWith220V();


        //接口适配器(缺省适配器)
//        Computer computer = new Computer();
//        Charger3Adapter charger3Adapter = new Charger3Adapter();
//        charger3Adapter.setComputer(computer);
//        charger3Adapter.connectWith20V();


    }
}
