package at.eee.examples.Figuren;

public class Figure {
    String Name;
    String type;
    int a;
    int b;
    double r;

    public Figure(String name, String type, int a, int b, double r) {
        Name = name;
        this.type = type;
        this.a = a;
        this.b = b;
        this.r = r;
    }

    //Fuktion
    public void getArea(String a){
        switch (a){
            case "kreis":
                double x = this.getR();
                double y = x * x * 3.14159;
                System.out.println("Der Flächeninhalt des Kreises ist: " + y);
                break;
            case "viereck":
                int b = this.getA();
                int c = this.getB();
                int d = b * c;
                System.out.println("Der Flächeninhalt des Vierecks ist: " + d);
                break;
            case "quadrat":
                b = this.getA();
                c = b * b;
                System.out.println("Der Flächeninhalt des Quadrats ist: " + c);
                break;
            case "würfel":
                b = this.getA();
                c = (b * b)
        }
    }

    //getter and setter
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
