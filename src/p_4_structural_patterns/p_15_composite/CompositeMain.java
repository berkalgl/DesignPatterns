package p_4_structural_patterns.p_15_composite;

public class CompositeMain {
    public static void main(String[] args) {

        final Computer computer = new Computer();

        Monitor monitor = new Monitor();
        IPart keyboard = new Keyboard();
        IPart mouse = new Mouse();
        IPart ram1 = new Ram();
        IPart ram2 = new Ram();

        computer.addPart(monitor);
        computer.addPart(keyboard);
        computer.addPart(mouse);
        computer.addPart(ram1);
        computer.addPart(ram2);

        // delete
        computer.removePart(ram2);
        computer.removePart(ram2);

        System.out.println( computer.title() );
        System.out.println( computer.price() );

        for( IPart item : computer.getIPartList() ) {
            System.out.println( item.title() + " - " + item.price() );
        }
    }
}
