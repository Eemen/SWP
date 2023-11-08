package at.eee.oop.mitLehrer;

import at.eee.oop.dockementation.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int iLeisung;
    private String sfarbe;
    private Fahrrad kofferraumfahrrad;
    private List<Kiste> kisten;
    public Car() {
    }

    public Car(int iLeisung, String sfarbe) {
        this.iLeisung = iLeisung;
        this.sfarbe = sfarbe;
        this.kisten = new ArrayList<>();
    }

    public void addKisten(Kiste kiste){
        this.kisten.add(kiste);
    }

    public List<Kiste> getKisten() {
        return kisten;
    }

    public void setKisten(List<Kiste> kisten) {
        this.kisten = kisten;
    }

    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }

    public int getiLeisung() {
        return iLeisung;
    }

    public void setiLeisung(int iLeisung) {
        this.iLeisung = iLeisung;
    }

    public String getSfarbe() {
        return sfarbe;
    }

    public void setSfarbe(String sfarbe) {
        this.sfarbe = sfarbe;
    }



}
