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

    public void saveFile(PhoneFile phoneFile){
        int freeSpace = getFreeSpace();
        int spaceCosume = this.camera.getResolution();
        int a = freeSpace
        if ()
        System.out.println(spaceCosume);
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
}
