import java.math.BigDecimal;

public class MilkDecorator extends BeverageDecorator{
    public  MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return this.beverage.getDescription() + " with milk";
    }

    public BigDecimal cost() {
        BigDecimal wrappedCost = this.beverage.cost();
        return wrappedCost.add(BigDecimal.valueOf(0.5));
    }
}
