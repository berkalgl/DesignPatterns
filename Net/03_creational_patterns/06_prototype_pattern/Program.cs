namespace _06_prototype_pattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            HomeAddress homeAddress = new HomeAddress("Istanbul");
            homeAddress.print();

            HomeAddress homeAddress2 = (HomeAddress)homeAddress.Clone();
            Console.WriteLine(homeAddress2.getCity());
            homeAddress2.setCity("Ankara");
            homeAddress2.print();
        }
    }
}