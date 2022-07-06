package p_4_structural_patterns.p_15_composite;

public class Keyboard implements IPart{
    @Override
    public String title() {
        return "CoolerMaster Klavye";
    }

    @Override
    public int price() {
        return 500;
    }
}
