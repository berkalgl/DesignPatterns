package p_5_creational_patterns.p_10_prototype;

public class CompanyAddress extends AddressPrototype{

    private String title;
    private String email;

    public CompanyAddress(String title, String email, String city, String address, String no) {
        this.title = title;
        this.email = email;
        setCity(city);
        setAddress(address);
        setNo(no);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
