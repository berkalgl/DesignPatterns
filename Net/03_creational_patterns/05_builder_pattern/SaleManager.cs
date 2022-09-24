namespace _05_builder_pattern
{
    public class SaleManager
    {
        private OrderBuilder _orderBuilder;

        public Car createOrder(String brandName, String modelName, String colorName, int power)
        {
            if (brandName.Equals("AUDI"))
                _orderBuilder = new AudiOrderBuilder();
            else if (brandName.Equals("FIAT"))
                _orderBuilder = new FiatOrderBuilder();

            _orderBuilder.SetBrand(brandName);
            _orderBuilder.SetModel(modelName);
            _orderBuilder.SetColor(colorName);
            _orderBuilder.SetPower(power);

            return _orderBuilder.GetOrderedCar();
        }

        public void printOrder()
        {
            Console.WriteLine(_orderBuilder.GetOrderedCar().GetBrand());
            Console.WriteLine(_orderBuilder.GetOrderedCar().GetModel());
            Console.WriteLine(_orderBuilder.GetOrderedCar().GetColor());
            Console.WriteLine(_orderBuilder.GetOrderedCar().GetPower());
        }
    }
}

