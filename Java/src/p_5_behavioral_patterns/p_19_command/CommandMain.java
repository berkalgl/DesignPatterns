package p_5_behavioral_patterns.p_19_command;

public class CommandMain {
    public static void main(String[] args) {
        Control control = new Control();

        control.click(0);
        control.click(1);
        control.click(2);
    }
}
