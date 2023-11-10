package at.eee.examples.bank;

public class CheckingsAccount {
    private int id;
    private double value;
    private double limit;

    public CheckingsAccount(int id, double value, double limit) {
        this.id = id;
        this.value = value;
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
