import java.math.BigDecimal;
import java.text.MessageFormat;

public class PayPalPayment implements Payment{

    @Override
    public void pay(BigDecimal amount) {
    PaymentGateway.getInstance().processPayment("PayPal",amount);
    }
}
