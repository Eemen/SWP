package at.eee.examples.isahasa;

public class Dog extends Animal{
    public Dog(int weight, int height) {
        super(weight, height);
    }

    public void bark(){
        System.out.println("wuf wuf");
    }
}
