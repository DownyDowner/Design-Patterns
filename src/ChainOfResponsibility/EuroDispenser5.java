package ChainOfResponsibility;

public class EuroDispenser5 extends DispenseChain {
    @Override
    public void handle(int amount) {
        if (amount >= BillConstants.BILL_FIVE) {
            int numberOfBills = amount / BillConstants.BILL_FIVE;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 5€");
        }
    }
}
