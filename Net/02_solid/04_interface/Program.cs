namespace Solid.Interface
{    
    public class Program
    {
        public static void Main(string[] args)
        {
            IBip bip = new AllSend();
            IAllSend iAllSend = new AllSend();

            Sms sms = new Sms();

            Call(iAllSend);
            Call(sms);
        }
        public static void Call(ISms sms)
        {
            sms.SendSms();
        }
    }
}