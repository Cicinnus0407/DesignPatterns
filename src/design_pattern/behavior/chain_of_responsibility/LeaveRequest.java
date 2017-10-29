package design_pattern.behavior.chain_of_responsibility;

/**
 * Created by Cicinnus on 2017/10/9.
 * 请假条对象
 */
public class LeaveRequest {
    //请假天数
    private int day;
    //请假人名字
    private String name;

    public LeaveRequest(int day, String name) {
        this.day = day;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
