namespace Solid.DependencyInversion
{
    public class JPG : IFiligran
    {
        public void AddFiligran(Filigran filigran)
        {
            filigran.CreateFiligran("JPG");
        }
    }
}
