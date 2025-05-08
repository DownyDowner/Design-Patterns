package ChainOfResponsibility;

public class EuroDispenser20 extends DispenseChain {
    @Override
    public void handle(int amount) {
        int remainder = amount;
        if (amount >= BillConstants.BILL_TWENTY) {
            int numberOfBills = amount / BillConstants.BILL_TWENTY;
            remainder = amount % BillConstants.BILL_TWENTY;
            System.out.println("Dispensing " + numberOfBills + " bill(s) of 20€");
        }
        next.handle(remainder);
    }
}
