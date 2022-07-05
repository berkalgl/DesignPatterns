package p_5_creational_patterns.p_9_builder;

public class AudiOrderBuilder extends OrderBuilder{

    public AudiOrderBuilder() {
    }

    @Override
    public void setBrand(String name) {
        getOrderedCar().setBrand(new Brand(name));
    }

    @Override
    public void setModel(String name) {
        getOrderedCar().setModel(new Model(name));
    }

    @Override
    public void setColor(String name) {
        getOrderedCar().setColor(name);
    }

    @Override
    public void setPower(int power) {
        getOrderedCar().setPower(power);
    }
}
