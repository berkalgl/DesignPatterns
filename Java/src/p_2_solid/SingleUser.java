package p_2_solid;

public class SingleUser {
    private String name;
    private String surname;
    private int age;

    public SingleUser(){}
    public SingleUser(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Profile name should have not been here.
    // We need seperate class for this purpose
    // Single Responsibility
    public String profileName(int uid ) {
        if (uid == 10)
            return "Berk Algul";

        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
