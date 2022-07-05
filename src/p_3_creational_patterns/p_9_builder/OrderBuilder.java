package p_3_creational_patterns.p_9_builder;

public abstract class OrderBuilder {

    public OrderBuilder() {
    }

    private Car orderedCar;
    public Car getOrderedCar(){
        if ( orderedCar == null)
            orderedCar = new Car();

        return orderedCar;
    }

    public abstract void setBrand ( String name);
    public abstract void setModel ( String name);
    public abstract void setColor ( String name);
    public abstract void setPower ( int power);

}
