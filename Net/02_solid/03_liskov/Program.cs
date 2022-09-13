// See https://aka.ms/new-console-template for more information
namespace Solid.Liskov
{
    public class Program
    {
        public static void Main(string[] args)
        {
            UsePdf usePdf = new UsePdf();
            usePdf.Read();
            usePdf.PrintPdf();

            UseFile useFile = new UseFile();
            useFile.Read();
        }
    }
}
