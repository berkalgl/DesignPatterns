package p_3_creational_patterns.p_10_prototype;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        final HomeAddress homeAddress = new HomeAddress("Istanbul", "Address", "34");
        homeAddress.print();

        final HomeAddress homeAddress2 = (HomeAddress) homeAddress.clone();
        homeAddress2.setCity("Ankara");
        homeAddress2.setNo("06");
        homeAddress2.print();

    }
}
