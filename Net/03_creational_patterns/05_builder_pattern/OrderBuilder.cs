namespace _05_builder_pattern
{
    public abstract class OrderBuilder
    {
        public OrderBuilder()
        {
        }

        private Car _orderedCar;

        public Car GetOrderedCar()
        {
            if (_orderedCar == null)
                _orderedCar = new Car();

            return _orderedCar;
        }

        public abstract void SetBrand(string name);
        public abstract void SetModel(string name);
        public abstract void SetColor(string name);
        public abstract void SetPower(int power);
    }
}

