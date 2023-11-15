package at.eee.examples.Handy;

public class Main {
    public static void main(String[] args) {

        SIM sim1 = new SIM(1, "+43356746454");
        Camera camera1 = new Camera(10);
        SDCard sdCard1 = new SDCard(100);
        PhoneFile phoneFile1 = new PhoneFile(1, 10, "Blume");
        PhoneFile phoneFile2 = new PhoneFile(2, 15, "Hase");
        sdCard1.addFile(phoneFile1);
        sdCard1.addFile(phoneFile2);
        Phone memetsphone = new Phone(camera1, sim1, sdCard1, "blue");

        memetsphone.takePicture(2232);
    }
}
