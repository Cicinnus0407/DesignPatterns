package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class MySQLImpl implements ExactDataImpl {
    @Override
    public ExactData readFromDB() {
        System.out.println("MySQL数据读取");
        return new ExactData();
    }
}
