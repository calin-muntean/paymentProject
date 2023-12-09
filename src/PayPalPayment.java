import java.math.BigDecimal;

public class PayPalPayment implements Payment{

    @Override
    public void pay(BigDecimal amount,DiscountStrategy discountStrategy) {
        BigDecimal discountedAmount= discountStrategy.applyDiscount(amount);
    PaymentGateway.getInstance().processPayment("PayPal",discountedAmount);
    }
}
