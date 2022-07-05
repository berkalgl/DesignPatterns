package p_1_oop.p_1_inheritance;

public class B extends Base{
    @Override
    public void write() {
        int sm = sum(23,55);
        System.out.println("Write Call in B" + sm);
    }
}
