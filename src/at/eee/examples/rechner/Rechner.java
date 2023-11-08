package at.eee.examples.rechner;

import at.eee.oop.mitLehrer.Kiste;

import java.util.ArrayList;
import java.util.List;

public class Rechner {
    private String sMarke;
    private int id;
    private boolean bwissenschaftsmodus = false;
    private boolean bwurzelrechner = false;
    private  List<Taste> tasten;

    //Konstrucktor
    public Rechner(String sMarke, int id) {
        this.sMarke = sMarke;
        this.id = id;
        this.tasten = new ArrayList<>();

    }

    //Funktionen
    public void addition(int a, int b){
       int c = a + b;
        System.out.println("Solution addition: " + c);
    }

    public void subtraktion(int a, int b){
        int c = a - b;
        System.out.println("Solution subtraktion: " + c);
    }

    public void multiplikation(int a, int b){
        int c = a * b;
        System.out.println("Solution multiplikation: " + c);
    }

    public void division(int a, int b){
        int c = a / b;
        System.out.println("Solution division: " + c);
    }

    public void togglebwissenschaftsmodus(){
        bwissenschaftsmodus =! bwissenschaftsmodus;
    }

    public void togglebwurzelrechner(){
        bwurzelrechner =! bwurzelrechner;
    }

    public void 

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Taste> getTasten() {
        return tasten;
    }

    public void setTasten(List<Taste> tasten) {
        this.tasten = tasten;
    }
}
