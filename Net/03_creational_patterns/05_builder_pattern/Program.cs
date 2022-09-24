namespace _05_builder_pattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            SaleManager saleManager = new SaleManager();

            saleManager.createOrder("AUDI", "A5", "Black", 120);

            saleManager.printOrder();
        }
    }
}