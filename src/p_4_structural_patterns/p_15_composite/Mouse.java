package p_4_structural_patterns.p_15_composite;

public class Mouse implements IPart{
    @Override
    public String title() {
        return "Razer Mouse";
    }

    @Override
    public int price() {
        return 400;
    }
}
