package at.eee.examples.lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private Element element;
    private String name;
    private List<Element> elements;

    //Konstuktor

    public Lamp(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    //Fuktion

    public void turnOn() {
        if (elements != null) {
            for (Element element : elements) {
                element.powerState();
                element.setState(true);
            }
        }
    }

    public double getOverallPowerUsage() {
        int a = 0;
        if (elements != null) {
            for (Element element : elements) {
                a += element.getPower();
            }
        }
        return a;
    }

    public void printNamesOfLightElements() {
        System.out.println("Die Namen aller Lichter sind: ");
        if (elements != null) {
            for (Element element : elements) {
                System.out.println(element.getName());
            }
        }
    }

    //getter and setter

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addLightElement(Element element){
        this.elements.add(element);
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
