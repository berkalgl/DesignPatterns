namespace _05_builder_pattern
{
    public class Brand
    {
        public string name { get; set; }

        public Brand(string name)
        {
            this.name = name;
        }

        public override string ToString()
        {
            return name;
        }
    }
}