package p_2_solid.openclose;

public class OracleDatabaseImpl implements IDatabase{
    @Override
    public void addBasket(Product product) {
        System.out.println("Oracle : " + product.toString());
    }
}
