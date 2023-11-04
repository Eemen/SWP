package at.eee.examples.cars;

public class Truck extends Car{
    private String trailer;

    public Truck(Engine engine, Producer producer, String color, int maxspeed, int baseprice, int baseconsume, String trailer) {
        super(engine, producer, color, maxspeed, baseprice, baseconsume);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
