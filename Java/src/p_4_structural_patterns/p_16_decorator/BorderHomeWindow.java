package p_4_structural_patterns.p_16_decorator;

public class BorderHomeWindow extends HomeWindowDecorator{
    @Override
    public void produce() {
        getHomeWindow().produce();
        borderPixel(3);
    }

    private void borderPixel(int i) {
        System.out.println(" Border With Pixes: " + i);
    }
}
