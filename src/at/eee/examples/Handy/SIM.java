package at.eee.examples.Handy;

public class SIM {
    private int id;
    private String number;

    //Konstruktor

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    //Funktionen

    //sim(id numbers)
    //doCell(String)

    //getter & setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
