package p_4_structural_patterns.p_13_bridge;

public abstract class Inventory {

    private IProduction iProduction;

    public Inventory(IProduction iProduction) {
        this.iProduction = iProduction;
    }

    public abstract void produce();

    public IProduction getiProduction() {
        return iProduction;
    }

    public void setiProduction(IProduction iProduction) {
        this.iProduction = iProduction;
    }
}
