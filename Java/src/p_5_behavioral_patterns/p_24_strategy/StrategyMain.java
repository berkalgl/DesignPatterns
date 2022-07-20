package p_5_behavioral_patterns.p_24_strategy;

public class StrategyMain {

    public static void main(String[] args) {

        Item i1 = new Item("TV", 2500);
        Item i2 = new Item("Tablet", 5000);

        IPayment paypal = new PaypalPayment("mail@mail.com", "12345");
        IPayment creditCart = new CreditCartPayment("Ali", "1293129312", "123","2022");

        ShoppingCart shoppinCart = new ShoppingCart();
        shoppinCart.addItem(i1);
        shoppinCart.addItem(i2);

        shoppinCart.setPayment(creditCart);
        shoppinCart.pay();
    }
}
