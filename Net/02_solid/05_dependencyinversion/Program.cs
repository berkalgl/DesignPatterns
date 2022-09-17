namespace Solid.DependencyInversion
{
    public class Program
    {
        public static void Main(string[] args)
        {
            PNG png = new PNG();
            JPG jpg = new JPG();

            Filigran pngFiligran = new Filigran();
            Filigran jpgFiligran = new Filigran();

            FiligranManager.Call(png, pngFiligran);
            FiligranManager.Call(jpg, jpgFiligran);
        }
    }
}