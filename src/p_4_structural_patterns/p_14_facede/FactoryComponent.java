package p_4_structural_patterns.p_14_facede;

public class FactoryComponent {
    //Singleton
    private static FactoryComponent instance = new FactoryComponent();

    public FactoryComponent() {
    }

    public static FactoryComponent getInstance(){
        return instance;
    }

    public IComponent getSubComponent1(){
        return new SubComponent1();
    }
}

