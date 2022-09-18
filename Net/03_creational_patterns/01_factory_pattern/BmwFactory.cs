namespace CreationalPatterns.FactoryPattern
{
    public class BmwFactory : CarFactory
    {
        public override void CreateCar()
        {
            ListOfCars.Add(new M2(120));
            ListOfCars.Add(new M3(150));
        }
    }
}
