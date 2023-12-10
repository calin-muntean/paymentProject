package main.Factory;
import main.Strategy.*;
import java.math.BigDecimal;
public interface Payment  {
    void pay(BigDecimal amount,DiscountStrategy discountStrategy);


}
