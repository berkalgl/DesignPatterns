package p_6_structural_patterns.p_12_adapter;

public class AdapterMain {
    public static void main(String[] args) {
        ICustomerCall customerCall = new CustomerAdapter();

        customerCall.call();
    }
}
