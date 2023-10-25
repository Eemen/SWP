package at.eee.oop;

public class Car {
    // Instanz / Gedächnisvariablen
   public int fuelConsumption;
   public int fuelAmount;
   public String brand;
   public String serialNumber;
   private String color;
   public int fuelVolume;

   Car car3 = new Car(int fc, String , String s){
     this.fuelConsumption
   }
   public Car(int fuelConsumption, String brand, String serialNumber){

   }

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

}
