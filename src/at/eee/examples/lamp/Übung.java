package at.eee.examples.lamp;

public class Übung {
    public static void main(String[] args) {

        Element e1 = new Element(1, "White", 0, false);
        Element e2 = new Element(2, "White", 5, true);
        Lamp l1 = new Lamp("Lamp");
        l1.addLightElement(e1);
        l1.addLightElement(e2);

        double a = l1.getOverallPowerUsage();
        System.out.println("Der Gesamtverbrauch ist " + a);

        l1.turnOn();

        a = l1.getOverallPowerUsage();
        System.out.println("Der Gesamtverbrauch ist " + a);

        l1.printNamesOfLightElements();
    }
}
