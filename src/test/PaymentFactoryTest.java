package test;
import main.Factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentFactoryTest {
    @Test
    void createCreditCardPayment() {
        Payment payment = PaymentFactory.create(PaymentMethod.CREDIT_CARD);
        Assertions.assertTrue(payment instanceof CreditCardPayment);
    }

    @Test
    void createPayPalPayment() {
        Payment payment = PaymentFactory.create(PaymentMethod.PAYPAL);
        Assertions.assertTrue(payment instanceof PayPalPayment);
    }

    @Test
    void createGooglePayPayment() {
        Payment payment = PaymentFactory.create(PaymentMethod.GOOGLE_PAY);
        Assertions.assertTrue(payment instanceof GooglePayPayment);
    }

//    @Test
//    void createUnsupportedPayment() {
//        assertThrows(RuntimeException.class, () -> PaymentFactory.create(PaymentMethod.));
//    }
//    private void assertThrows(Class<RuntimeException> runtimeExceptionClass, Object o) {
//    }
}

