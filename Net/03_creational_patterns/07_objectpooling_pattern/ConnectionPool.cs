namespace _07_objectpooling_pattern
{
    public class ConnectionPool
    {
        static List<Connection> connectionList = new();

        public ConnectionPool()
        {
            Init();
        }

        public void Init()
        {
            for (int i = 0; i < 3; i++)
                connectionList.Add(new Connection());
        }

        public static Connection getConnection()
        {
            if (connectionList.Count == 0)
                throw new Exception("there is no object");

            Connection instance = connectionList[0];
            ConnectionPool.connectionList.RemoveAt(0);
            return instance;
        }

        public static void release(Connection conn)
        {
            if (conn != null)
                connectionList.Add(conn);
        }
    }
}

