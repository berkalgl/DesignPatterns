package p_4_structural_patterns.p_13_bridge;

public class ProductionImpl implements IProduction{

    private final Factory1 factory1 = new Factory1();

    @Override
    public void produceNotebook() {
        factory1.produceRedNotebook();
    }

    @Override
    public void producePencil() {
        factory1.produceRedPencil();
    }
}
