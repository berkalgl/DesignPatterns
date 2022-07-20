package p_4_structural_patterns.p_15_composite;

public class Ram implements IPart{
    @Override
    public String title() {
        return "Toshiba 16 GB Ram DDR4";
    }

    @Override
    public int price() {
        return 500;
    }
}
