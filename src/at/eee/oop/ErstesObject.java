package at.eee.oop;

public class ErstesObject {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A2345";
        c1.fuelAmount = 70;
        c1.fuelVolume = 50;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1233";
        c2.fuelAmount = 50;
        c2.fuelVolume = 100;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.break_();
        c2.turboBoost();
        c2.honk(3);
        c2.getRemainingRange();
    }


}
