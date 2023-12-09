import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMethod paymentMethod){
        switch (paymentMethod){
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case PAYPAL -> {
                return new PayPalPayment();

            }
            case GOOGLE_PAY -> {
                return new GooglePayPayment();
            }
            default -> {

                try {
                    throw new ClassNotFoundException(MessageFormat.format("{0} is not supported",paymentMethod));
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }


            }
        }
    }
}
