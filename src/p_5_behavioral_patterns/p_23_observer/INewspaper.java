package p_5_behavioral_patterns.p_23_observer;

public interface INewspaper {
    void addSub(ISubscriber subscriber);
    void removeSub(ISubscriber subscriber);
    void sendNewspaper();
}
