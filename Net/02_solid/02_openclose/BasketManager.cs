public class BasketManager
{
    public static void manager(IDatabase database, Product product)
    {
        database.addBasket(product);
    }
}