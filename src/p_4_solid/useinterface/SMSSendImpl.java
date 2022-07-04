package p_4_solid.useinterface;

public class SMSSendImpl implements ISMS{
    @Override
    public void sendSms() {
        System.out.println("send Sms in SMSSendImpl");
    }
}
