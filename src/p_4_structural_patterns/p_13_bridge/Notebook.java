package p_4_structural_patterns.p_13_bridge;

public class Notebook extends Inventory{

    public Notebook(IProduction iProduction) {
        super(iProduction);
    }

    @Override
    public void produce() {
        getiProduction().produceNotebook();
    }
}
