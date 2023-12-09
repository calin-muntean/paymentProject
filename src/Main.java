import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        DiscountStrategy noDiscount = new NoDiscount();
        DiscountStrategy percentageDiscount = new PercentageDiscount(new BigDecimal("12"));
        DiscountStrategy fixedAmountDiscount = new FixedAmount(new BigDecimal("12"));


        Payment creditCardProcessor = PaymentFactory.create(PaymentMethod.CREDIT_CARD);
        creditCardProcessor.pay(new BigDecimal("100"),noDiscount);

        Payment payPalProcessor = PaymentFactory.create(PaymentMethod.PAYPAL);
        payPalProcessor.pay(new BigDecimal("70"),percentageDiscount);
        Payment googlepayProccesor = PaymentFactory.create(PaymentMethod.GOOGLE_PAY);
        googlepayProccesor.pay(new BigDecimal("10"),fixedAmountDiscount);
    }


}