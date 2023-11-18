package at.eee.examples.Kamera;

public class Camera {
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private SDCard sdCard;
    private Lens lens;

    public Camera(int weight, String color, Producer producer, SDCard sdCard, Lens lens) {
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.sdCard = sdCard;
        this.lens = lens;
    }

    public void takePicture(String name, String date){
        if (sdCard.isSaving()){
            File picture = new File(name, date, lens.getFileSize());
            sdCard.storePicture(picture);
        }
    }

    public void changeSDCard(){
        SDCard freshSDCard = new SDCard(32, lens);
        sdCard = freshSDCard;
        sdCard.calculateFreeSpace();
        System.out.println("SDKarte wurde erfolgreich ausgewechselt");
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
