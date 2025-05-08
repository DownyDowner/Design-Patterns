package ChainOfResponsibility;

public abstract class DispenseChain {
    protected DispenseChain next = null;

    public abstract void handle(int amount);

    public final void setNext(DispenseChain next) {
        this.next = next;
    }
}
