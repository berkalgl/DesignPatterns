namespace OOP.Inheritance
{
    public class A : Base
    {
        public override void Write()
        {
            int sm = Sum(40, 60);
            Console.WriteLine("Write Call in A " + sm);
        }

        public int Minus(int a, int b)
        {
            if (a > 5)
                base.Write();

            return a-b;
        }
    }
}