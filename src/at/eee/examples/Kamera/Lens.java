package at.eee.examples.Kamera;

public class Lens {
    private int pixel; // 2000 - kleines Foto, 4000 - mittleres Foto, 6000 - großes Foto
    private int fileSize;
    public Lens(int pixel) {
        this.pixel = pixel;
    }

    public int getFileSize(){
        switch (pixel){
            case 2000:
                fileSize = 2;
                break;
            case 4000:
                fileSize = 4;
                break;
            case 6000:
                fileSize = 6;
                break;
        }
        return fileSize;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}
