package p_5_factory_pattern;

public class AudiFactory extends CarFactory{
    @Override
    public void createCar() {
        getLs().add(new A3(120));
        getLs().add(new A5(150));
    }
}
