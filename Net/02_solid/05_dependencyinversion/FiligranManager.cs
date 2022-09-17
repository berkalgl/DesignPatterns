namespace Solid.DependencyInversion
{
    public static class FiligranManager
    {
        public static void Call(IFiligran filigran, Filigran flg)
        {
            filigran.AddFiligran(flg);
        }
    }
}