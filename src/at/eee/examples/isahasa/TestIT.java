package at.eee.examples.isahasa;

public class TestIT {
    public static void main(String[] args) {
        Animal a1 = new Animal(50, 30);
        Animal a2 = new Animal(60, 10);

        Zoo zoo = new Zoo("Zoo", "Paraweg");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();

        Dog d1 = new Dog(21, 32);
        d1.bark();

        zoo.addAnimal(d1);
        zoo.printAnimals();
    }
}
