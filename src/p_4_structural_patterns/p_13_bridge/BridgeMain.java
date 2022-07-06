package p_4_structural_patterns.p_13_bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Inventory pencilInventory = new Pencil(new ProductionImpl());
        pencilInventory.produce();

        pencilInventory = new Pencil(new ProductionImpl2());
        pencilInventory.produce();

        Inventory notebookInventory = new Notebook(new ProductionImpl());
        notebookInventory.produce();

        notebookInventory = new Notebook(new ProductionImpl2());
        notebookInventory.produce();
    }
}
