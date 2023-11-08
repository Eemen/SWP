package at.eee.oop.mitLehrer;

import at.eee.oop.dockementation.RearMirror;

import java.util.List;

public class Fahrrad {
    private int id;
    private String sColor;
    private int iheight;


    public Fahrrad() {
    }

    public Fahrrad(int id, String sColor, int iheight) {
        this.id = id;
        this.sColor = sColor;
        this.iheight = iheight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public int getIheight() {
        return iheight;
    }

    public void setIheight(int iheight) {
        this.iheight = iheight;
    }

}
