package p_4_structural_patterns.p_15_composite;

public class Monitor implements IPart{
    @Override
    public String title() {
        return "ASUS 144 Hz";
    }

    @Override
    public int price() {
        return 4000;
    }
}
