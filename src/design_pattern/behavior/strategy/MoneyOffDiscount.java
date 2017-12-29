package design_pattern.behavior.strategy;


/**
 * 满减
 */
public class MoneyOffDiscount extends Discount {
    @Override
    double calculate(double price) {
        if (price > 50) {

            return price - 10;
        } else {
            return price;
        }
    }
}
