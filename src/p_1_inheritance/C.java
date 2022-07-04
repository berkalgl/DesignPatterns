package p_1_inheritance;

public class C extends Base{
    @Override
    public void write() {
        int sm = sum(30, 60);
        System.out.println("Write Call in C" + sm);
    }
}
