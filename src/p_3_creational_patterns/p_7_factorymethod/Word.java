package p_5_creational_patterns.p_7_factorymethod;

public class Word implements Document{
    @Override
    public String documentType() {
        return "Word Document";
    }
}
