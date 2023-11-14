package at.eee.examples.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Funktionen

    public void saveFiles(){
        
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
}
