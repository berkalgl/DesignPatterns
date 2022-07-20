namespace OOP.Abstract
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Person p1 = new(10);
            Console.WriteLine(p1.Name());
        }
    }
}