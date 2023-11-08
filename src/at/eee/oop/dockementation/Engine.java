package at.eee.oop.dockementation;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int motorRate;
    private int fuelConsumption;

    public Engine(int horsePower, TYPE type, int motorRate, int fuelConsumption) {
        this.horsePower = horsePower;
        this.type = type;
        this.motorRate = motorRate;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(int amount){
        System.out.println("The motor is running with" + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMotorRate() {
        return motorRate;
    }

    public void setMotorRate(int motorRate) {
        this.motorRate = motorRate;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}