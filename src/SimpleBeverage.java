import java.math.BigDecimal;

public class SimpleBeverage implements Beverage{
    @Override
    public String getDescription() {
        return "A simple beverage";
    }
    public BigDecimal cost() {
        return BigDecimal.valueOf(3);
    }
}
