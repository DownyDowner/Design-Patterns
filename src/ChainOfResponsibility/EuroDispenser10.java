package ChainOfResponsibility;

public class EuroDispenser10 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_TEN) {
            int numberOfBills = amount / BillConstants.BILL_TEN;
            remainder = amount % BillConstants.BILL_TEN;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 10€");
        }
        next.handle(remainder);
    }
}
