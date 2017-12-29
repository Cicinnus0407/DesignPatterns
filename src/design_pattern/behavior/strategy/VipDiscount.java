package design_pattern.behavior.strategy;

/**
 * Vip的打折算法
 */
public class VipDiscount extends Discount {


    @Override
    double calculate(double price) {
        return price * 0.8;
    }
}
