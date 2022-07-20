package p_2_solid.dependencyinversion;

public class PNG implements IFiligran {
    @Override
    public void addFiligran(Filigran filigran) {
        filigran.createFiligran("PNG");
    }
}
