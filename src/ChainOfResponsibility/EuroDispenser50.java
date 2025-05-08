package ChainOfResponsibility;

public class EuroDispenser50 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_FIFTY) {
            int numberOfBills = amount / BillConstants.BILL_FIFTY;
            remainder = amount % BillConstants.BILL_FIFTY;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 50€");
        }
        next.handle(remainder);
    }
}
