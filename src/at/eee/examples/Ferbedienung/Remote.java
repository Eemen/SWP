package at.eee.examples.Ferbedienung;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private int id;
    private List<Battery> batteries;
    private Battery battery;


    //Konstruktor
    public Remote(int id) {
        this.id = id;
        this.batteries = new ArrayList<>();
    }

    //Fuktionen
    public void getIndividualStatus(){
        System.out.println("battery 1: " + this.getBatteries().get(0).getChargelevel());
        System.out.println("battery 2: " + this.getBatteries().get(1).getChargelevel());
    }

    public void getStatus(){
        int a = this.getBatteries().get(0).chargingStatus();
        int b = this.getBatteries().get(1).chargingStatus();
        int c = (a + b) / 2;
        System.out.println("average charging level: " + c);
    }

    public void turnOn(){
        int a = this.getBatteries().get(0).getChargelevel();
        int b = this.getBatteries().get(1).getChargelevel();
        int c =  a / 20;
        int d =  b / 20;
        a -= c;
        b -= d;
        this.getBatteries().get(0).setChargelevel(a);
        this.getBatteries().get(1).setChargelevel(b);
    }

    public void turnOff(){
        this.getBatteries().get(0).batteryshutdown();
        this.getBatteries().get(1).batteryshutdown();
    }


    //getter und Setter
    public void addBattery(Battery battery){
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
    }
}
