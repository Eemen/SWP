package at.eee.examples.Ferbedienung;



public class Fernbedienung {
    public static void main(String[] args) {

        Battery b1 = new Battery(80);
        Battery b2 = new Battery(60);
        Remote f1 = new Remote(233);
        f1.addBattery(b1);
        f1.addBattery(b2);

        f1.getIndividualStatus();
        f1.getStatus();
        f1.turnOn();
        f1.getIndividualStatus();
        f1.getStatus();
        f1.turnOff();

    }
}
