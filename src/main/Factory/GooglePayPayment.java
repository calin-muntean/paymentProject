package main.Factory;
import main.Strategy.*;
import main.Singleton.*;
import java.math.BigDecimal;
public class GooglePayPayment implements Payment{

    @Override
    public void pay(BigDecimal amount, DiscountStrategy discountStrategy) {
        BigDecimal discountedAmount= discountStrategy.applyDiscount(amount);
        PaymentGateway.getInstance().processPayment("GooglePay",discountedAmount);
    }
}
