package at.eee.oop.mitLehrer;

public class Übung {
    public static void main(String[] args) {
        Car car = new Car(12, "Grün");
        System.out.println(car.getiLeisung());
        Fahrrad fahrrad = new Fahrrad(2, "yellow", 70);
        System.out.println(fahrrad.getId());
        car.setKofferraumfahrrad(fahrrad);
        Kiste kiste = new Kiste(6);
        Kiste kiste2 = new Kiste(12);
        car.addKisten(kiste);
        car.addKisten(kiste2);
        System.out.println(car.getKisten().get(0).getiAnzahlflaschen());
        System.out.println(car.getKisten().get(1).getiAnzahlflaschen());
    }
}
