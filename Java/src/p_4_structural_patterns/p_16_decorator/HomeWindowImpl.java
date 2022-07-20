package p_4_structural_patterns.p_16_decorator;

public class HomeWindowImpl implements IHomePart{
    @Override
    public void produce() {
        System.out.println("Home Window produced");
    }
}
