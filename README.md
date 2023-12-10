# PaymentApp
This application has three methods of payment, you can pay by Credit Card, PayPal or GooglePay. It also has a discount strategy that allows users to receive different discounts like fixed discount and percentage discount. I used three design patterns to make it.
## Singleton Pattern
I create a class PaymentGateway where i use Singleton to get a single instance of it and after I used it in method pay for each Payment Classes.
## Factory Pattern
The PaymentFactory class is responsible for creating instances of different payment methods.
The create method in the PaymentFactory class takes a PaymentMethod enum as an argument.
If the requested payment method is CREDIT_CARD, PAYPAL, or GOOGLE_PAY, it returns a new instance of the corresponding concrete product.
## Strategy Pattern
I used it to encapsulate and make strategies for applying discounts, there are tree choices: NoDiscount, FixedDiscount and PercentageDiscount.
## Test
I also write unit tests for PaymentFactory and DiscountStrategy
