package billing;

public class Bill {

    private static final Dealer dealer = new Dealer();

    public int generateMonthlyBill(int adverts, int products) {
        //int customerAdvertCost = 50;
        int privateAdvertCost = 20;
        int productCost = 10;
        int customerAdvertTotal = adverts * dealer.advertCost();
        int productTotal = products * productCost * adverts;
        return customerAdvertTotal + productTotal;
    }
}
