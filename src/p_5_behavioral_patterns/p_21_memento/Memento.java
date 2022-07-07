package p_5_behavioral_patterns.p_21_memento;

public class Memento {

    private Object[] elements;

    public Memento(Object[] elements) {
        setElements(elements);
    }
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
