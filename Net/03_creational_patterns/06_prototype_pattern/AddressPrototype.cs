namespace _06_prototype_pattern
{
    public class AddressPrototype : ICloneable
    {
        public object Clone()
        {
            return base.MemberwiseClone();
        }

        private string city;

        public string getCity()
        {
            return city;
        }
        public void setCity(string city)
        {
            this.city = city;
        }

        public void print()
        {
            Console.WriteLine(this.GetHashCode());
        }
    }
}

