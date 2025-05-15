package billing;

public class Bill {

    public int generateMonthlyBill(int adverts, int products) {
        int customerAdvertCost = 50;
        int privateAdvertCost = 20;
        int productCost = 10;
        int customerAdvertTotal = adverts * customerAdvertCost;
        int productTotal = products * productCost * adverts;
        return customerAdvertTotal + productTotal;
    }
}
