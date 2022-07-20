namespace OOP.Inheritance
{
    public class C : Base
    {
        public override void Write()
        {
            int sm = Sum(30, 60);
            Console.WriteLine("Write Call in C " + sm);
        }
    }
}