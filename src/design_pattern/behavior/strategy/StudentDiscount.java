package design_pattern.behavior.strategy;

/**
 * 学生价
 */
public class StudentDiscount extends Discount {
    @Override
    double calculate(double price) {
        return price * 0.5;
    }
}
