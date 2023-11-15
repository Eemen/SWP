package at.eee.examples.Handy;

import at.eee.examples.isahasa.Animal;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;
    private PhoneFile phoneFile;
    private Camera camera;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Funktionen

    public void saveFile(){
        int freeSpace = getFreeSpace();
        int spaceConsume = getCamera().getResolution();
        if (freeSpace > spaceConsume){
            addFile(phoneFile);
            System.out.println("Es wurde erfolgreich gespeichert");
        }else {
            System.out.println("Sie haben zu wenig Speicherplatz");
        }
    }

    public int getFreeSpace(){
        int a = 0;
        int b;
        for (PhoneFile file: this.files){
            a += file.getSize();
        }
        b = this.capacity - a;
        return b;
    }

    public void getAllFiles(){
        System.out.println(P);
    }

    public void addFile(PhoneFile file){
        this.files.add(file);
    }

    //getter & setter

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void setFiles(List<PhoneFile> files) {
        this.files = files;
    }

    public PhoneFile getPhoneFile() {
        return phoneFile;
    }

    public void setPhoneFile(PhoneFile phoneFile) {
        this.phoneFile = phoneFile;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
