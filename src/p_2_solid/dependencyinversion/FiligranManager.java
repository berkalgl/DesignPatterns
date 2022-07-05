package p_4_solid.dependencyinversion;

public class FiligranManager {


    static void call(IFiligran filigran, Filigran flg)
    {
        filigran.addFiligran(flg);
    }
}
