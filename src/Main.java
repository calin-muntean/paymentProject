import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = PaymentGateway.getInstance();

        // Factory Method pattern usage
        Payment creditCardProcessor = PaymentFactory.create(PaymentMethod.CREDIT_CARD);
        creditCardProcessor.pay(BigDecimal.valueOf(100.00));

        Payment payPalProcessor = PaymentFactory.create(PaymentMethod.PAYPAL);
        payPalProcessor.pay(BigDecimal.valueOf(50.00));
        Payment googlepayProcessor = PaymentFactory.create(PaymentMethod.GOOGLE_PAY);
        googlepayProcessor.pay(BigDecimal.valueOf(60.00));
    }



}
