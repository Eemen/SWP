package at.eee.examples.Figuren;

public class TestIT {
    public static void main(String[] args) {
        Figure k1 = new Figure("Kreis1", "kreis", 0 ,0 ,10);
        Figure v1 = new Figure("Viereck1", "viereck",2, 3, 0);
        Figure q1 = new Figure("Quadrat1", "quadrat",4,0 , 0);
        Figure w1 = new Figure("Würfel", "würfel", 6, 0, 0);

        k1.getArea(k1.getType());
        v1.getArea(v1.getType());
        q1.getArea(q1.getType());
    }
}
