namespace _02_singleton_pattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Thread process1 = new Thread(() =>
            {
                TestSingleton();
            });
            Thread process2 = new Thread(() =>
            {
                TestSingleton();
            });

            process1.Start();
            process2.Start();

            process1.Join();
            process2.Join();

        }
        public static void TestSingleton()
        {
            Singleton singleton = Singleton.GetInstance();
        }
    }
}