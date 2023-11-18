package at.eee.examples.Handy;

public class PhoneFile {
    private int extension;
    private int size;
    private String name;

    //Konstruktor

    public PhoneFile(int extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    //Funktionen

    public String getInfo() {
        return "Name: " + this.name + ", Size: " + this.size;
    }

    //getter & setter

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
