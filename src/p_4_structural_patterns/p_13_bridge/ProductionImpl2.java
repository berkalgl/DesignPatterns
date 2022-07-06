package p_4_structural_patterns.p_13_bridge;

public class ProductionImpl2 implements IProduction{

    private final Factory2 factory2 = new Factory2();

    @Override
    public void produceNotebook() {
        factory2.produceGreenNotebook();
    }

    @Override
    public void producePencil() {
        factory2.produceGreenPencil();
    }
}
