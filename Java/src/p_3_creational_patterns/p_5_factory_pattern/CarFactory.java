package p_3_creational_patterns.p_5_factory_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory {

    public CarFactory(){
        createCar();
    }

    public abstract void createCar();
    private List<Car> ls = new ArrayList<>();

    public List<Car> getLs() {
        return ls;
    }

    public void setLs(List<Car> ls) {
        this.ls = ls;
    }
}
