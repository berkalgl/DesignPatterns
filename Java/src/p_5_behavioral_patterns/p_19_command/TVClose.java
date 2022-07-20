package p_5_behavioral_patterns.p_19_command;

public class TVClose implements ICommand{
    private TV tv = null;

    public TVClose(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvClose();
    }
}
