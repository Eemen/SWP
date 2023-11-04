package at.eee.examples.cars;

public class Übung {
    public static void main(String[] args) {

        Engine e1 = new Engine("DIESEL", 200 );
        Producer p1 = new Producer("Hans", "Deutschland", 5);
        Car c1 = new Car(e1, p1, "Green", 100, 100000, 10);
        c1.calculatePrice();
        c1.drive20000km();
        c1.drive20000km();
        c1.drive20000km();
        Truck t1 = new Truck(e1, p1, "Green", 100, 100000, 10, "Trailer");
        System.out.println(t1.getTrailer() + t1.getColor());
        t1.drive();

    }
}
