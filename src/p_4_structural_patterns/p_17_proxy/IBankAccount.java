package p_4_structural_patterns.p_17_proxy;

public interface IBankAccount {

    int withdrawMoney(int quantity);
    void depositMoney(int quantity);
    String getName();
    void setName(String name);

}
