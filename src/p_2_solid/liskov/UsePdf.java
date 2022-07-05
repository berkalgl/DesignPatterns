package p_2_solid.liskov;

public class UsePdf extends PdfPrint{
    @Override
    public void sendMail() {
        System.out.println(" PDF send mail ");
    }

    @Override
    public void read() {
        System.out.println(" PDF read");
    }
}
