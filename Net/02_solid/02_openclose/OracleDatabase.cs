public class OracleDatabase : IDatabase{
    public void addBasket(Product product) {
        Console.WriteLine("Oracle : " + product.title);
    }
}