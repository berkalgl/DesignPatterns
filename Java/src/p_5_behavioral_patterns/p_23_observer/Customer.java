package p_5_behavioral_patterns.p_23_observer;

public class Customer implements ISubscriber{

    private INewspaper newspaper;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public INewspaper getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(INewspaper newspaper) {
        this.newspaper = newspaper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Newspaper sent to :" + this.name);
    }

    @Override
    public void cancelSub() {
        getNewspaper().removeSub(this);
        System.out.println("Newspaper sub removed sub : "+ this.name);
    }

    @Override
    public void subscribe(INewspaper newspaper) {
        setNewspaper(newspaper);
        newspaper.addSub(this);
        System.out.println(this.name + " subscribed to newspaper");
    }
}
