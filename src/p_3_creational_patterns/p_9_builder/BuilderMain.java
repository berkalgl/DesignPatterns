package p_5_creational_patterns.p_9_builder;

public class BuilderMain {
    public static void main(String[] args) {
        SaleManager saleManager = new SaleManager();

        saleManager.createOrder("AUDI", "A5", "Black", 120);

        saleManager.printOrder();
    }
}
