import java.math.BigDecimal;
import java.text.MessageFormat;

public class CreditCardPayment implements  Payment{
    @Override
    public void pay(BigDecimal amount) {
        PaymentGateway.getInstance().processPayment("CreditCard",amount);
    }
}
