import java.math.BigDecimal;

public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return this.beverage.getDescription() + " with sugar";
    }

    public BigDecimal cost() {
        BigDecimal wrappedCost = this.beverage.cost();
        return wrappedCost.add(BigDecimal.valueOf(0.7));
    }
}
