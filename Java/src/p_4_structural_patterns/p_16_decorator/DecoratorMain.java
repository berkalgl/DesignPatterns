package p_4_structural_patterns.p_16_decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        HomeWindowImpl homeWindow = new HomeWindowImpl();
        homeWindow.produce();

        BorderHomeWindow borderHomeWindow = new BorderHomeWindow();
        borderHomeWindow.produce();
    }
}
