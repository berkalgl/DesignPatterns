package p_5_behavioral_patterns.p_23_observer;

public interface ISubscriber {
    void update();
    void cancelSub();
    void subscribe(INewspaper newspaper);
}
