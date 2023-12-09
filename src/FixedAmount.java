import java.math.BigDecimal;

public class FixedAmount implements DiscountStrategy{
    private final BigDecimal discountAmount;

    public FixedAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        BigDecimal result= amount.subtract(discountAmount);
        BigDecimal zero= new BigDecimal("0");
        if(result.compareTo(zero) >0 )
            return amount.subtract(discountAmount);
        else return zero;

    }
}
