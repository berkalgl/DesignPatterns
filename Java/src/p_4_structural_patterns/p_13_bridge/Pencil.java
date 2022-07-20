package p_4_structural_patterns.p_13_bridge;

public class Pencil extends Inventory{

    public Pencil(IProduction iProduction) {
        super(iProduction);
    }

    @Override
    public void produce() {
        getiProduction().producePencil();
    }
}
