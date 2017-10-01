package design_pattern.structural.facade;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class OperatorFacade extends AbstractOperatorFacade {

    private Operator1 operator1;
    private Operator2 operator2;
    private Operator3 operator3;
    private Operator4 operator4;

    public OperatorFacade() {
        operator1 = new Operator1();
        operator2 = new Operator2();
        operator3 = new Operator3();
        operator4 = new Operator4();
    }

    @Override
    public void drinkTea(String teaName) {
        operator1.washCup();
        operator2.washTea();
        operator3.BoiledWater();
        operator4.makeTea();
        System.out.println(teaName + "泡好了");
    }
}
