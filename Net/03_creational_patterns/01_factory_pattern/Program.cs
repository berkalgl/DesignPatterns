namespace CreationalPatterns.FactoryPattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            AudiFactory audiFactory = new AudiFactory();
            BmwFactory bmwFactory = new BmwFactory();

            Call(audiFactory);
            Call(bmwFactory);

        }
        public static  void Call(CarFactory carFactory)
        {
            foreach (Car car in carFactory.ListOfCars)
                Console.WriteLine(car);
        }
    }
}