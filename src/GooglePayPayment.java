import java.math.BigDecimal;
import java.text.MessageFormat;

public class GooglePayPayment implements Payment{
    @Override
    public void pay(BigDecimal amount) {

        PaymentGateway.getInstance().processPayment("GooglePay",amount);

    }

}
