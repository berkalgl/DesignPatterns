namespace Solid.DependencyInversion
{
    public class PNG : IFiligran
    {
        public void AddFiligran(Filigran filigran)
        {
            filigran.CreateFiligran("PNG");
        }
    }
}
