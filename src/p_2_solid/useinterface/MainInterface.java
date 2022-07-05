package p_4_solid.useinterface;

public class MainInterface {
    public static void main(String[] args) {
        IBip bip = new AllSendImpl();
        IAllSend iAllSend = new AllSendImpl();

        SMSSendImpl sms = new SMSSendImpl();

        call(iAllSend);
        call(sms);
    }

    public static void call(ISMS sms)
    {
        sms.sendSms();
    }
}
