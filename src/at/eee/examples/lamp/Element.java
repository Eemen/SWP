package at.eee.examples.lamp;

public class Element {
    private int name;
    private String color;
    private int power;
    private boolean state; // false - aus, true -  an

    //Konstruktor

    public Element(int name, String color, int power, boolean state) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.state = state;
    }


    //Fuktion
    public void powerState(){
         if(state) {
             System.out.println("Mein Name ist " + this.name + " Ich bin bereits eingeschaltet");
         }else {
             setPower(getPower() + 5);
         }
    }

    //Setter and getter

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


}
