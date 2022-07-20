namespace OOP.Inheritance
{
    public class B : Base
    {
        public override void Write()
        {
            int sm = Sum(23, 55);
            Console.WriteLine("Write Call in B " + sm);
        }
    }
}