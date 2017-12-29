package design_pattern.behavior.strategy;

public class MovieTicket {
    private double price;

    private Discount discount;

    public MovieTicket() {
    }

    public MovieTicket(Discount discount) {
        this.discount = discount;
    }

    /**
     * 获取价格
     *
     * @return
     */
    public double getPrice() {
        if (discount != null) {

            return discount.calculate(price);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
