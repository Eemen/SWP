package at.eee.examples.Handy;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Camera camera;
    private SIM sim;
    private SDCard sdCard;
    private String color;

    public Phone(Camera camera, SIM sim, SDCard sdCard, String color) {
        this.camera = camera;
        this.sim = sim;
        this.sdCard = sdCard;
        this.color = color;
    }

    public void takePicture(int bild){
        camera.makePicture(3, "Kabel");
    }

    public void getFiles() {
        List<PhoneFile> filesList = sdCard.getAllFiles();
        for (PhoneFile file : filesList) {
            System.out.println("Name: " + file.getName());
        }
    }

    //makeCall

    //getFreeSpace

    //printAllFiles

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
