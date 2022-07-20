package p_2_solid.dependencyinversion;

public class JPG implements IFiligran {

    @Override
    public void addFiligran(Filigran filigran) {
        filigran.createFiligran("JPG");
    }
}
