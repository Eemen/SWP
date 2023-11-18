package at.eee.examples.Kamera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<File> files;
    private Lens lens;

    public SDCard(int capacity, Lens lens) {
        this.capacity = capacity;
        this.lens = lens;
        this.files = new ArrayList<>();
    }

    public void storePicture(File picture){
        addFile(picture);
    }

    public int calculateFreeSpace(){
        int a = 0;
        int b;

        for (File file: this.files){
            a += file.getSize();
        }
        b = this.capacity - a;
        return b;
    }

    public boolean isSaving(){
        boolean ableToSave;
        if (calculateFreeSpace() < lens.getFileSize()){
            System.out.println("Sie haben nicht genug Platz für das Foto");
            ableToSave = false;
        } else if (calculateFreeSpace() > 10) {
            System.out.println("Das Bild wurde erfolgreich gespeichert");
            ableToSave = true;
        } else {
            System.out.println("Der Speicherplatz wird knapp");
            ableToSave = true;
        }

        return ableToSave;
    }

    public void addFile(File file){
        this.files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}



