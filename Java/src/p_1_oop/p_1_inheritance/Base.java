package p_1_oop.p_1_inheritance;

public class Base {
    public Base(){
        System.out.println("Base Call");
    }
    public void write(){
        System.out.println("Write Call in Base");
    }
    public int sum(int a, int b) { return a + b; }
}
