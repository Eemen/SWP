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
