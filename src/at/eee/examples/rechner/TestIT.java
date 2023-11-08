package at.eee.examples.rechner;

public class TestIT {
    public static void main(String[] args) {

        Taste taste1 = new Taste(1);
        Taste taste2 = new Taste(2);
        Taste taste3 = new Taste(3);
        Taste taste4 = new Taste(4);
        Rechner rechner = new Rechner("It-Rechner", 3);
        rechner.addTasten(taste1);
        rechner.addTasten(taste2);
        rechner.addTasten(taste3);
        rechner.addTasten(taste4);
        rechner.addition(rechner.getTasten().get(0).getWert(),rechner.getTasten().get(2).getWert());
        rechner.subtraktion(rechner.getTasten().get(2).getWert(),rechner.getTasten().get(0).getWert());
        rechner.multiplikation(rechner.getTasten().get(0).getWert(),rechner.getTasten().get(2).getWert());
        rechner.division(rechner.getTasten().get(2).getWert(),rechner.getTasten().get(2).getWert());

    }
}
