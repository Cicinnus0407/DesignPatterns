package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class OracleImpl implements ExactDataImpl {

    @Override
    public void readFrom(ExactData exactData) {
        System.out.println("Oracle数据读取");
    }
}
