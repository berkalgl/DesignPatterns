package p_5_creational_patterns.p_10_prototype;

public class HomeAddress extends AddressPrototype{

    public HomeAddress(String city, String address, String no) {
        setAddress(address);
        setCity(city);
        setNo(no);
    }
}
