package main.Singleton;
import java.math.BigDecimal;
public class PaymentGateway {
    private static PaymentGateway instance;
    private PaymentGateway(){}
    public static synchronized PaymentGateway getInstance(){
        if(instance == null){
            instance=new PaymentGateway();
        }
        return instance;
    }
    public void processPayment(String PaymentMethod, BigDecimal amount){
        System.out.println("Processing "+PaymentMethod+" payment of $"+amount);
    }
}
