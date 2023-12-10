package test;
import main.Strategy.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PercentageDiscountTest {

    @Test
    void applyDiscount_validPercentage_shouldApplyDiscount() {
        // Arrange
        BigDecimal originalAmount = new BigDecimal("100");
        BigDecimal percentage = new BigDecimal("10");
        PercentageDiscount discount = new PercentageDiscount(percentage);

        // Act
        BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

        // Assert
        BigDecimal expectedDiscountedAmount = originalAmount.subtract(originalAmount.multiply(percentage.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP)));
        assertEquals(expectedDiscountedAmount, discountedAmount);
    }

    @Test
    void applyDiscount_invalidPercentage_shouldNotApplyDiscount() {
        // Arrange
        BigDecimal originalAmount = new BigDecimal("100");
        BigDecimal invalidPercentage = new BigDecimal("95");
        PercentageDiscount discount = new PercentageDiscount(invalidPercentage);

        // Act
        BigDecimal discountedAmount = discount.applyDiscount(originalAmount);

        // Assert
        assertEquals(originalAmount, discountedAmount);
        // You might want to assert console output if you have a proper way to capture it in your application
    }
}

