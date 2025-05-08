package ChainOfResponsibility;

public class EuroDispenser200 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_TWO_HUNDRED) {
            int numberOfBills = amount / BillConstants.BILL_TWO_HUNDRED;
            remainder = amount % BillConstants.BILL_TWO_HUNDRED;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 200€");
        }
        next.handle(remainder);
    }
}
