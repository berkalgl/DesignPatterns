using System.Drawing;
using System.Reflection;

namespace _05_builder_pattern
{
    public class Car
    {
        private Model model;

        private Brand brand;

        private string color;

        private int power;

        public Brand GetBrand()
        {
            return brand;
        }

        public void SetBrand(Brand brand)
        {
            this.brand = brand;
        }

        public Model GetModel()
        {
            return model;
        }

        public void SetModel(Model model)
        {
            this.model = model;
        }

        public String GetColor()
        {
            return color;
        }

        public void SetColor(string color)
        {
            this.color = color;
        }

        public int GetPower()
        {
            return power;
        }

        public void SetPower(int power)
        {
            this.power = power;
        }

    }
}

