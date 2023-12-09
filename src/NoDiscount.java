import java.math.BigDecimal;

public class NoDiscount implements DiscountStrategy{
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount;
    }
}
