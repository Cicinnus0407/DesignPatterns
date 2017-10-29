package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class DB2Impl implements ExactDataImpl {

    @Override
    public ExactData readFromDB() {
        System.out.println("DB2数据读取");
        return new ExactData();
    }
}
