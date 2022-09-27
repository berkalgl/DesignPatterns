namespace _07_objectpooling_pattern
{
    public class Connection
    {
        public void connect()
        {
            Console.WriteLine("Connected : " + this.GetHashCode());
        }
    }
}

