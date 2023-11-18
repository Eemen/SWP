package at.eee.examples.Kamera;

public class Main {
    public static void main(String[] args) {

        Producer producer = new Producer("Sony", "Deutschland");
        File file = new File("Wald", "22/4/2022", 4);
        Lens lens = new Lens(4000);
        SDCard sdCard = new SDCard(16, lens);
        sdCard.addFile(file);
        Camera camera = new Camera(6, "Block", producer, sdCard, lens);

        camera.takePicture("Bild1", "22/3/2022");
        camera.takePicture("Bild2", "22/3/2022");
        camera.takePicture("Bild3", "22/3/2022");
        camera.takePicture("Bild4", "22/3/2022");
        camera.changeSDCard();
        camera.takePicture("Bild4", "22/3/2022");
    }
}
