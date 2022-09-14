namespace Solid.Interface
{
    public class AllSend : IAllSend
    {
        public void SendBip() {
        }

        public void SendEmail() {
        }

        public void SendSms() {
            Console.WriteLine(" Sms call");
        }
    }
}