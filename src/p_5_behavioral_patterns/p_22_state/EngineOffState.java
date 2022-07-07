package p_5_behavioral_patterns.p_22_state;

public class EngineOffState implements IState{
    @Override
    public void on(Engine engine) {
        engine.setState(new EngineOnState());
        System.out.println("Engine is on");
    }

    @Override
    public void off(Engine engine) {
        System.out.println("Engine is off");
    }
}
