package p_5_behavioral_patterns.p_22_state;

public class Engine {
    private IState state;
    public Engine() {
        setState(new EngineOffState());
        System.out.println("Engine is off");
    }
    public void start(){
        getState().on(this);
    }
    public void stop(){
        getState().off(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
