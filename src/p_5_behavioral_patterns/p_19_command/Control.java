package p_5_behavioral_patterns.p_19_command;

public class Control {
    private ICommand[] iCommands = new ICommand[2];

    public Control() {
        final TV tv = new TV();
        iCommands[0] = new TVOpen(tv);
        iCommands[1] = new TVClose(tv);
    }

    public void click(int index){
        if (index > iCommands.length - 1 || index < 0)
            throw new RuntimeException("Index could not be found!");

        iCommands[index].execute();
    }
}
