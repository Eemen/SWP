package at.eee.oop1;

public class Battery {
    private int chargelevel;

    //Konstuktor
    public Battery(int chargelevel) {
        this.chargelevel = chargelevel;
    }

    //Fuktionen
    public void batteryshutdown(){
        System.out.println("Kein Verbraucher angleschlossen");
    }

    //getter und Setter
    public int getChargelevel() {
        return chargelevel;
    }

    public void setChargelevel(int chargelevel) {
        System.out.println("Verbraucher angeschlossen");
        this.chargelevel = chargelevel;
    }

}


