import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageDiscount implements DiscountStrategy{
    private final BigDecimal percentage;

    public PercentageDiscount(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return  amount.subtract(amount.multiply(percentage.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP)));
    }
}
