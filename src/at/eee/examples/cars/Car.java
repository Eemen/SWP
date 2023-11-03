package at.eee.examples.cars;

public class Car {
    private Engine engine;
    private Producer producer;
    private String color;
    private int maxspeed;
    private int baseprice;
    private double baseconsume;

    //Konstruktor
    public Car(Engine engine, Producer producer, String color, int maxspeed, int baseprice, int baseconsume) {
        this.engine = engine;
        this.producer = producer;
        this.color = color;
        this.maxspeed = maxspeed;
        this.baseprice = baseprice;
        this.baseconsume = baseconsume;
    }

    //Funktionen
    public void calculatePrice(){
        int a = getProducer().getDiscount();
        int b = this.baseprice;
        int c = b - (b * a / 100);
        System.out.println("The dicounted price is: " + c);
    }

    public void drive20000km(){
        int a = getEngine().getDrivenDistance();
        int b = a + 20000;
        getEngine().setDrivenDistance(b);

        if (b > 50000){
            double c = this.baseconsume;
            this.baseconsume = c + (c * 9.8 / 100);
            System.out.println("My base consume is now higher: " + this.baseconsume);
        }else {System.out.println("My base consume is: " + this.baseconsume);
        }
    }

    //getter and setter
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }

    public double getBaseconsume() {
        return baseconsume;
    }

    public void setBaseconsume(double baseconsume) {
        this.baseconsume = baseconsume;
    }
}
