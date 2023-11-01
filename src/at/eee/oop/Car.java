package at.eee.oop;

public class Car {
    // Instanzvariablen (private)
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelVolume;

    // Konstruktor
    public Car(int fuelConsumption, String brand, String serialNumber, int fuelVolume) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelVolume = fuelVolume;
    }

    // Getter und Setter für die Instanzvariablen
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    // Weitere Methoden bleiben unverändert
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        int a;
        int b = 0;
        a = this.fuelVolume;
        b = a / 5;
        if (b < this.fuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = amountOfRepetitions; i > 0; i--) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        float c = this.fuelAmount;
        float d = c / this.fuelConsumption;
        System.out.println("Sie haben noch " + d + "km Reichweite");
    }
}
