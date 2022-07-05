package p_5_creational_patterns.p_11_objectpool;

public class ObjectPoolMain {
    public static void main(String[] args) {

        new ConnectionPool();

        Connection c1 = ConnectionPool.getConnection();
        Connection c2 = ConnectionPool.getConnection();
        Connection c3 = ConnectionPool.getConnection();

        c1.connect();
        c2.connect();
        c3.connect();

        ConnectionPool.release(c1);
        Connection c4 = ConnectionPool.getConnection();
        c4.connect();


    }
}
