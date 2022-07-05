package p_4_solid.openclose;

public class MysqlDatabaseImpl implements IDatabase{
    @Override
    public void addBasket(Product product) {
        System.out.println("Mysql : " + product.toString());
    }
}
