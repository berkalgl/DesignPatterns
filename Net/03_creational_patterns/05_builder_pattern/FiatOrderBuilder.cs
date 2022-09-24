using System;
namespace _05_builder_pattern
{
    public class FiatOrderBuilder : OrderBuilder
    {
        public FiatOrderBuilder()
        {
        }

        public override void SetBrand(string name)
        {
            GetOrderedCar().SetBrand(new Brand(name));
        }

        public override void SetColor(string name)
        {
            GetOrderedCar().SetColor(name);
        }

        public override void SetModel(string name)
        {
            GetOrderedCar().SetModel(new Model(name));
        }

        public override void SetPower(int power)
        {
            GetOrderedCar().SetPower(power);
        }
    }
}

