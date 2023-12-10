package main.Factory;
import main.Strategy.*;
import main.Singleton.*;
import java.math.BigDecimal;
public class CreditCardPayment implements  Payment{
    @Override
    public void pay(BigDecimal amount,DiscountStrategy discountStrategy) {
        BigDecimal discountedAmount= discountStrategy.applyDiscount(amount);
        PaymentGateway.getInstance().processPayment("CreditCard",discountedAmount);
    }


}
