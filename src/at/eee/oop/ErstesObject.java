package at.eee.oop;

public class ErstesObject {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A2345");
        c1.setFuelAmount(70);
        c1.setFuelVolume(50);

        /*
        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1233";
        c2.fuelAmount = 50;
        c2.fuelVolume = 100;



        Car c3 = new Car(17, "Opel", "1232U", 50);

        System.out.println(c3.serialNumber);

         */
        System.out.println(c1.getFuelAmount());
        /*

        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.break_();
        c2.turboBoost();
        c2.honk(3);
        c2.getRemainingRange();

         */
    }


}