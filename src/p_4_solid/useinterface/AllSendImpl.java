package p_4_solid.useinterface;

public class AllSendImpl implements IAllSend{
    @Override
    public void sendBip() {
    }

    @Override
    public void sendEmail() {
    }

    @Override
    public void sendSms() {
        System.out.println(" Sms call");

    }
}
