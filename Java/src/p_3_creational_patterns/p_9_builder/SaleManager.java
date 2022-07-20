package p_3_creational_patterns.p_9_builder;

public class SaleManager {
    private OrderBuilder _orderBuilder;

    public Car createOrder( String brandName, String modelName, String colorName, int power){
        if ( brandName.equals("AUDI"))
            _orderBuilder = new AudiOrderBuilder();
        else if ( brandName.equals("FIAT"))
            _orderBuilder = new FiatOrderBuilder();

        _orderBuilder.setBrand(brandName);
        _orderBuilder.setModel(modelName);
        _orderBuilder.setColor(colorName);
        _orderBuilder.setPower(power);

        return _orderBuilder.getOrderedCar();
    }

    public void printOrder()
    {
        System.out.println(_orderBuilder.getOrderedCar().getBrand());
        System.out.println(_orderBuilder.getOrderedCar().getModel());
        System.out.println(_orderBuilder.getOrderedCar().getColor());
        System.out.println(_orderBuilder.getOrderedCar().getPower());
    }
}
