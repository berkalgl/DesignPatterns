package p_5_factory_pattern;

public class MainFactory {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BMWFactory bmwFactory = new BMWFactory();

        call(audiFactory);
        call(bmwFactory);
    }

    public static void call( CarFactory carFactory)
    {
        for(Car item: carFactory.getLs())
            System.out.println(item);
    }
}
