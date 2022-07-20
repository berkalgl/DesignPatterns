namespace OOP.Inheritance
{
    public class Program
    {
        public static void Main(string[] args)
        {
            A a = new();
            // Base a = new A();
            // a.minus() wont work

            B b = new();
            C c = new();

            a.Write();
            b.Write();
            c.Write();

            Call(a);
            Call(b);
            Call(c);

        }
        public static void Call(Base b){
            if(b is A)
            {
                ((A)b).Minus(10,4);
            }
            b.Write();
        }
    }
}