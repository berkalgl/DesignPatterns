package p_5_behavioral_patterns.p_24_strategy;

public class CreditCartPayment implements IPayment{

    private String name;
    private String cardNumber;
    private String cvv;
    private String expiredDate;

    public CreditCartPayment(String name, String cardNumber, String cvv, String expiredDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiredDate = expiredDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Credit Card Payment, amount :" + amount);
    }
}
