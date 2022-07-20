package p_5_behavioral_patterns.p_22_state;

public interface IState {
    void on(Engine engine);
    void off(Engine engine);
}
