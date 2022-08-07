public class MysqlDatabase : IDatabase 
{
    public void addBasket(Product product)
    {
        Console.WriteLine("Mysql:" + product.title);
    }
}