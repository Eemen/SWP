package at.eee.examples.Handy;

public class Camera {
    private int resolution;
    private SDCard sdCard;

    public Camera(int resolution, SDCard sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    //Funktionen

    public void makePicture(int extension, String name){
        PhoneFile phoneFile = new PhoneFile(extension, this.resolution, name);
        sdCard.setPhoneFile(phoneFile);
        sdCard.saveFile();
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
