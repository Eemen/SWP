package at.eee.oop.dockementation;

public class Tire {
    private int size;
    private int id;
    private int position;

    public Tire(int size, int id, int position) {
        this.size = size;
        this.id = id;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
