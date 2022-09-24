namespace _05_builder_pattern
{
    public class Model
    {
        public string name { get; set; }

        public Model(string name)
        {
            this.name = name;
        }

        public override string ToString()
        {
            return name;
        }
    }
}

