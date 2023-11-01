package at.eee.oop;

public class Car {
    // Instanzvariablen (private)
    private Engine engine;
    private Tank tank;
   // private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    //private int fuelVolume;

    // Konstruktor
    public Car(/*int fuelConsumption,*/ String brand, String serialNumber/*, int fuelVolume*/) {

        this.brand = brand;
        this.serialNumber = serialNumber;
        //this.fuelVolume = fuelVolume;
        this.engine = new Engine(140, Engine.TYPE.DIESEL, 30, 6);
        Tank t1 = new Tank(50);
    }
    /*
        public void abfrage(){
            System.out.println(this.fuelAmount + this.fuelVolume + this.fuelConsumption + this.serialNumber + this.brand + this.getEngine().getHorsePower()  );
        }

    // Getter und Setter für die Instanzvariablen
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }*/

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

    /*public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }*/

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    // Weitere Methoden bleiben unverändert
    public void drive() {
        int speed = this.getEngine().getMotorRate();
        System.out.println("I am driving at: " + speed + " rate" );
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    /*public void turboBoost() {
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

    public void getRemainingRange() {
        float c = this.fuelAmount;
        float d = c / this.fuelConsumption;

        System.out.println("Sie haben noch " + d + "km Reichweite");
    }


    public void honk(int amountOfRepetitions) {
        for (int i = amountOfRepetitions; i > 0; i--) {
            System.out.println("Tuuut");
        }
    }

     */



}
