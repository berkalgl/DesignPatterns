namespace CreationalPatterns.FactoryPattern
{
    public class AudiFactory : CarFactory
    {
        public override void CreateCar()
        {
            ListOfCars.Add(new A3(120));
            ListOfCars.Add(new A5(150));
        }
    }
}
