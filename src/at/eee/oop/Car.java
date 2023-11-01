package at.eee.oop;

public class Car {
    // Instanz / Gedächnisvariablen
   private int fuelConsumption;
   private int fuelAmount;
   private String brand;
   private String serialNumber;
   private String color;
   private int fuelVolume;

/*
   public Car(int fuelConsumption, String brand, String serialNumber, int fuelVolume){
       this.fuelConsumption = fuelConsumption;
       this.brand = brand;
       this.serialNumber = serialNumber;
       this.fuelVolume = fuelVolume;
   }*/

   public void drive(){
       this.fuelAmount = this.fuelAmount - fuelConsumption;
       System.out.println("I am driving");
   }

   public void break_(){
       System.out.println("Ich bremse");
   }

   public void turboBoost(){
       int a;
       int b = 0;
       a = this.fuelVolume;
       b = a/5;
       if (b < this.fuelAmount) {
           System.out.println("SuperBoostMode");
       }else{
           System.out.println("Not enough fuel to go to Superboost");
       }
   }

   public void honk(int amountOfRepetitions){
       for (int i = amountOfRepetitions; i > 0; i--) {
           System.out.println("Tuuut");
       }
   }

   public void getRemainingRange(){
       float c = this.fuelAmount;
       float d = c/this.fuelConsumption;
       System.out.println("Sie haben noch " + d + "km Reichweite");
   }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
       if (fuelAmount>100){
           this.fuelAmount = 100;
       }else{
           this.fuelAmount = fuelAmount;
       }

    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

}
