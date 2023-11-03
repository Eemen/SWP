package at.eee.examples.cars;

public class Producer {
    private String name;
    private String countryOfOrigin;
    private int discount;

    //Konstruktor
    public Producer(String name, String countryOfOrigin, int discount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    //Fuktionen

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
