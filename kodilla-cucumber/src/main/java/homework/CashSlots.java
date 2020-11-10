package homework;

public class CashSlots {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}

