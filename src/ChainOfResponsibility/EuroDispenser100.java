package ChainOfResponsibility;

public class EuroDispenser100 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_HUNDRED) {
            int numberOfBills = amount / BillConstants.BILL_HUNDRED;
            remainder = amount % BillConstants.BILL_HUNDRED;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 100€");
        }
        next.handle(remainder);
    }
}
