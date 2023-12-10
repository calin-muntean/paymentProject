package main;
import main.Strategy.*;
import main.Factory.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {

        DiscountStrategy noDiscount = new NoDiscount();
        DiscountStrategy percentageDiscount = new PercentageDiscount(new BigDecimal("100"));
        DiscountStrategy fixedAmountDiscount = new FixedAmount(new BigDecimal("12"));

        Payment creditCardProcessor = PaymentFactory.create(PaymentMethod.CREDIT_CARD);
        creditCardProcessor.pay(new BigDecimal("100"),noDiscount);

        Payment payPalProcessor = PaymentFactory.create(PaymentMethod.PAYPAL);
        payPalProcessor.pay(new BigDecimal("70"),percentageDiscount);

        Payment googlepayProccesor = PaymentFactory.create(PaymentMethod.GOOGLE_PAY);
        googlepayProccesor.pay(new BigDecimal("10"),fixedAmountDiscount);

    }


}