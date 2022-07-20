package p_5_behavioral_patterns.p_22_state;

public class StateMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.stop();
        engine.stop();

        engine.start();
        engine.start();
    }
}
