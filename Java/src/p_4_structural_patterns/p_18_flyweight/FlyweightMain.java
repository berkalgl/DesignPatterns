package p_4_structural_patterns.p_18_flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        String line1 = "Berk Algul Java ";
        String line2 = "Berk Algul Net";

        WordManager.instance().addLine(line1, 0);
        WordManager.getAllWord();
    }
}
