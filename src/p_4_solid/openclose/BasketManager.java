package p_4_solid.openclose;

public class BasketManager {
    public static void manager( IDatabase database, Product product){
        database.addBasket(product);
    }
}
