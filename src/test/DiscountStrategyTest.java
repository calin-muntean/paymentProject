package test;
import main.Strategy.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiscountStrategyTest {
    @Test
    public void forFixedAmount_validAmount() {
        //given
        BigDecimal originalAmount = new BigDecimal("100");
        BigDecimal fixedAmount = new BigDecimal("10");
        FixedAmount discount = new FixedAmount(fixedAmount);

        //when
        BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

        //then
        BigDecimal expectedDiscountedAmount = originalAmount.subtract(fixedAmount);
        assertEquals(expectedDiscountedAmount, discountedAmount);
    }

    @Test
    public void forFixedAmount_invalidAmount() {
        //given
        BigDecimal originalAmount = new BigDecimal("100");
        BigDecimal fixedAmount = new BigDecimal("110");
        FixedAmount discount = new FixedAmount(fixedAmount);
        //when
        BigDecimal discountedAmount = discount.applyDiscount(originalAmount);
        //then
        assertEquals(originalAmount, discountedAmount);
    }


        @Test
        void applyDiscount_validPercentage_shouldApplyDiscount() {
            // given
            BigDecimal originalAmount = new BigDecimal("100");
            BigDecimal percentage = new BigDecimal("10");
            PercentageDiscount discount = new PercentageDiscount(percentage);

            // when
            BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

            // then
            BigDecimal expectedDiscountedAmount = originalAmount.subtract(originalAmount.multiply(percentage.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP)));
            assertEquals(expectedDiscountedAmount, discountedAmount);
        }

        @Test
        void applyDiscount_invalidPercentage_shouldNotApplyDiscount() {
            // given
            BigDecimal originalAmount = new BigDecimal("100");
            BigDecimal invalidPercentage = new BigDecimal("95");
            PercentageDiscount discount = new PercentageDiscount(invalidPercentage);

            // when
            BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

            // then
            assertEquals(originalAmount, discountedAmount);

        }
    @Test
    public void forNoDiscount() {
        //given
        BigDecimal originalAmount = new BigDecimal("100");
        NoDiscount discount = new NoDiscount();

        //when
        BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

        //then
        BigDecimal expectedDiscountedAmount;
        expectedDiscountedAmount = originalAmount;
        assertEquals(expectedDiscountedAmount, discountedAmount);
    }
    }
