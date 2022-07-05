package p_4_structural_patterns.p_12_adapter;

public class CustomerAdapter extends CustomerEntry implements ICustomerCall{

    @Override
    public void call() {
        System.out.println("Call Line");
        entry();
    }
}
