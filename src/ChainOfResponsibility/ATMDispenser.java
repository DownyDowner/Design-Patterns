package ChainOfResponsibility;

public class ATMDispenser {
    private DispenseChain dispenser;

    public ATMDispenser() {
        EuroDispenser500 d500 = new EuroDispenser500();
        EuroDispenser200 d200 = new EuroDispenser200();
        EuroDispenser100 d100 = new EuroDispenser100();
        EuroDispenser50 d50 = new EuroDispenser50();
        EuroDispenser20 d20 = new EuroDispenser20();
        EuroDispenser10 d10 = new EuroDispenser10();
        EuroDispenser5 d5 = new EuroDispenser5();

        d500.setNext(d200);
        d200.setNext(d100);
        d100.setNext(d50);
        d50.setNext(d20);
        d20.setNext(d10);
        d10.setNext(d5);
        d5.setNext(null);

        this.dispenser = d500;
    }

    public void dispense(int amount) {
        dispenser.handle(amount);
    }
}
