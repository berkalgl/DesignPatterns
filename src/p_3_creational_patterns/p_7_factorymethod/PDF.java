package p_3_creational_patterns.p_7_factorymethod;

public class PDF implements Document{

    @Override
    public String documentType() {
        return "Pdf Document";
    }
}
