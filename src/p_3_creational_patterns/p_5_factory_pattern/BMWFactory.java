package p_5_creational_patterns.p_5_factory_pattern;

public class BMWFactory extends CarFactory{
    @Override
    public void createCar() {
        getLs().add( new I8(100));
        getLs().add( new M3(650));
    }
}
