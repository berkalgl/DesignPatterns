package p_5_behavioral_patterns.p_19_command;

public class TVOpen implements ICommand{

    private TV tv = null;

    public TVOpen(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvOpen();
    }
}
