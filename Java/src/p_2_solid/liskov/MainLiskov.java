package p_2_solid.liskov;

public class MainLiskov {
    public static void main(String[] args) {
        UsePdf usePdf = new UsePdf();
        usePdf.read();
        usePdf.sendMail();

        UseFile useFile = new UseFile();
        useFile.read();
    }
}
