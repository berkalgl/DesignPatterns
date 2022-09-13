namespace Solid.Liskov
{
    public class UseFile : Print
    {
        public override void Read() {
            Console.WriteLine("UseFile Read");
        }
    }
}