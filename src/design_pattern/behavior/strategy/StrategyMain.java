package design_pattern.behavior.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Discount discount = new VipDiscount();
        MovieTicket movieTicket = new MovieTicket(discount);
        movieTicket.setPrice(80);

        double realPrice = movieTicket.getPrice();
        System.out.println("最终售价:"+realPrice);
    }
}
