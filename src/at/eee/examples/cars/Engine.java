package at.eee.examples.cars;

public class Engine {
    private String type;
    private int horsePower;
    private int drivenDistance = 0;

    //Konstruktor
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }


    //Funktionen

    //getter and setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }

    public void setDrivenDistance(int drivenDistance) {
        this.drivenDistance = drivenDistance;
    }
}
