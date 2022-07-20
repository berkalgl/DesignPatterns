namespace OOP.Inheritance
{
    public class Base {
        public Base()
        {
            Console.WriteLine("Base Called");
        }

        public virtual void Write()
        {
            Console.WriteLine("Write called in Base");
        }
        public int Sum(int a, int b) { return a+b;}
    }
}