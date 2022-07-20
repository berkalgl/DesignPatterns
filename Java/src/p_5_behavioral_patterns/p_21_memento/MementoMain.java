package p_5_behavioral_patterns.p_21_memento;

public class MementoMain {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.addLine(0, "X1");
        doc.addLine(1, "X2");
        doc.addLine(2, "X3");
        doc.addLine(3, "X4");

        Memento mx = doc.createMemento();
        System.out.println(doc);

        System.out.println("--------------------------");
        doc.removeLine(1);
        doc.addLine(1,"Y2");
        System.out.println(doc);
        Memento my = doc.createMemento();

        System.out.println("--------------------------");
        doc.setMemento(mx);
        System.out.println(doc);
    }
}
