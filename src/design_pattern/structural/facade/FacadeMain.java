package design_pattern.structural.facade;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class FacadeMain {
    public static void main(String[] args) {
        AbstractOperatorFacade abstractOperatorFacade = new OperatorFacade();
        abstractOperatorFacade.drinkTea("乌龙");
    }
}
