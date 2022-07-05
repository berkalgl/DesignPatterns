package p_5_creational_patterns.p_11_objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    static List<Connection> connectionList = new ArrayList<>();

    public ConnectionPool(){
        init();
    }

    public void init(){
        for (int i = 0; i < 3; i++)
            connectionList.add(new Connection());
    }

    static Connection getConnection(){
        if (connectionList.size() == 0)
            throw new RuntimeException("there is no object");

        Connection instance = connectionList.get(0);
        ConnectionPool.connectionList.remove(0);
        return instance;
    }

    static void release(Connection conn)
    {
        if ( conn != null)
            connectionList.add(conn);
    }

}
