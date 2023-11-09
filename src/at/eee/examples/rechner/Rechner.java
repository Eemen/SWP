package at.eee.examples.rechner;

import java.util.ArrayList;
import java.util.List;

public class Rechner {
    private String sMarke;
    private double id;
    private boolean bwissenschaftsmodus = false;
    private boolean bwurzelrechner = false;
    private  List<Taste> tasten;

    //Konstrucktor
    public Rechner(String sMarke, double id) {
        this.sMarke = sMarke;
        this.id = id;
        this.tasten = new ArrayList<>();

    }

    //Funktionen
    public void addition(double a, double b){
        double c = a + b;
        System.out.println("Solution addition: " + c);
    }

    public void subtraktion(double a, double b){
        double c = a - b;
        System.out.println("Solution subtraktion: " + c);
    }

    public void multiplikation(double a, double b){
        double c = a * b;
        System.out.println("Solution multiplikation: " + c);
    }

    public void division(double a, double b){
        double c = a / b;
        System.out.println("Solution division: " + c);
    }

    public void togglebwissenschaftsmodus(){
        bwissenschaftsmodus =! bwissenschaftsmodus;
    }

    public void togglebwurzelrechner(){
        bwurzelrechner =! bwurzelrechner;
    }

    public void sinusFunktion(double a, double b){
        if (bwissenschaftsmodus) {
            double sinusWert = Math.sin(a / b);
            System.out.println("Your sinus is: " + sinusWert);
        }else {
            System.out.println("Please turn on the science mode");
        }
    }
    public void cosinusFunktion(double a, double b){
        if (bwissenschaftsmodus) {
            double cosinusWert = Math.cos(a / b);
            System.out.println("Your cosinus is: " + cosinusWert);
        }else {
            System.out.println("Please turn on the science mode");
        }
    }

    public void wurzelFunktion(double a){
        if (bwurzelrechner) {
            double wurzelWert = Math.sqrt(a);
            System.out.println("Your square route is: " + wurzelWert);
        }else {
            System.out.println("Please turn on the square route mode");
        }
    }


    public void addTasten(Taste taste){
        this.tasten.add(taste);
    }
    //getter & setter

    public String getsMarke() {
        return sMarke;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public List<Taste> getTasten() {
        return tasten;
    }

    public void setTasten(List<Taste> tasten) {
        this.tasten = tasten;
    }
}
