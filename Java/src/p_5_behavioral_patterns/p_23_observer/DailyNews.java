package p_5_behavioral_patterns.p_23_observer;

import java.util.ArrayList;

public class DailyNews implements INewspaper{

    private ArrayList<ISubscriber> subscribers = new ArrayList<>();

    public ArrayList<ISubscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(ArrayList<ISubscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void addSub(ISubscriber subscriber) {
        getSubscribers().add(subscriber);
    }

    @Override
    public void removeSub(ISubscriber subscriber) {
        getSubscribers().remove(subscriber);
    }

    @Override
    public void sendNewspaper() {
        for(ISubscriber subscriber:getSubscribers())
            subscriber.update();
    }
}
