namespace CreationalPatterns.FactoryPattern
{
    public abstract class CarFactory
    {
        public CarFactory()
        {
            CreateCar();
        }
        public abstract void CreateCar();

        public List<Car> ListOfCars { get; set; } = new List<Car>();
    }
}
