package p_5_behavioral_patterns.p_22_state;

public class EngineOnState implements IState{
    @Override
    public void on(Engine engine) {
        System.out.println("Engine is on");
    }

    @Override
    public void off(Engine engine) {
        engine.setState(new EngineOffState());
        System.out.println("Engine is off");
    }
}
