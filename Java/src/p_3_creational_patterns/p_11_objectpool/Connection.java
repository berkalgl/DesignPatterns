package p_3_creational_patterns.p_11_objectpool;

public class Connection {
    public void connect(){
        System.out.println("Connect: " + this.hashCode());
    }
}
