package billing;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BillingTest {
    private static final Bill bill = new Bill();

    @Test
    public void givenCustomerWithAdvertAndProduct_returnBill() {
        // Given
        int adverts = 20;
        int products = 1;

        // When
        int result = bill.generateMonthlyBill(adverts, products);

        // Then
        assertThat(result).isEqualTo(1200);
    }

    @Test
    public void givenCustomerWithAdvertAndTwoProduct_returnBill() {
        // Given
        int adverts = 1000;
        int products = 2;

        // When
        int result = bill.generateMonthlyBill(adverts, products);

        // Then
        assertThat(result).isEqualTo(70000);
    }
    @Ignore
    @Test
    public void givenPrivateSellerWithAdvertOnly_returnBill() {
        // Given
        int adverts = 3;
        int products = 0;

        // When
        int result = bill.generateMonthlyBill(adverts, products);

        // Then
        assertThat(result).isEqualTo(60);
    }

    @Ignore
    @Test
    public void givenPrivateSellerWithAdvertAndProduct_returnBill() {
        // Given
        int adverts = 1;
        int products = 1;

        // When
        int result = bill.generateMonthlyBill(adverts, products);

        // Then
        assertThat(result).isEqualTo(30);
    }
}
