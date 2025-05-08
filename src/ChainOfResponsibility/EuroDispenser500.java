package ChainOfResponsibility;

public class EuroDispenser500 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_FIVE_HUNDRED) {
            int numberOfBills = amount / BillConstants.BILL_FIVE_HUNDRED;
            remainder = amount % BillConstants.BILL_FIVE_HUNDRED;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 500€");
        }
        next.handle(remainder);
    }
}
