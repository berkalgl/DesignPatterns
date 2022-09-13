namespace Solid.Liskov
{
    public class UsePdf : PdfPrint
    {
        public override void PrintPdf() {
            Console.WriteLine(" PDF send mail ");
        }

        public override void Read() {
            Console.WriteLine(" PDF read");
        }
    }
}