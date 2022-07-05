package p_3_creational_patterns.p_10_prototype;

public class AddressPrototype implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    private String city;
    private String address;
    private String no;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    public void print()
    {
        System.out.println(this.hashCode());
    }
}
