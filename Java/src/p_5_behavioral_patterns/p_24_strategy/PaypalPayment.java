package p_5_behavioral_patterns.p_24_strategy;

public class PaypalPayment implements IPayment{

    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment, amount :" + amount);
    }
}
