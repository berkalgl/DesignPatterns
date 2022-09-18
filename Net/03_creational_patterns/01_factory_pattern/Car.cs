using System.Text;

namespace CreationalPatterns.FactoryPattern
{
    public abstract class Car
    {
        private string title { get; set; }
        private string color { get; set; }
        private int power { get; set; }
        public Car(string title, string color, int power)
        {
            this.title = title;
            this.color = color;
            this.power = power;
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder("Car{");
            sb.Append("title='").Append(title).Append('\'');
            sb.Append(", color='").Append(color).Append('\'');
            sb.Append(", power='").Append(power);
            sb.Append("}");
            return sb.ToString();

        }
    }
}