package p_4_structural_patterns.p_17_proxy;

public class ProxyMain {
    public static void main(String[] args) {
        IBankAccount iBankAccount = new BankAccountImpl(5000, "BerkAccount");

        iBankAccount = new MyAccountProxy(iBankAccount);

        iBankAccount.depositMoney(2000);
        int total = iBankAccount.withdrawMoney(500 );

        System.out.println(iBankAccount.getName() + " " + total);

        iBankAccount = new DifferentAccountProxy(iBankAccount);
        iBankAccount.setName("BerkAccount2");
        iBankAccount.depositMoney(2000);
        int total2 = iBankAccount.withdrawMoney(500 );

        System.out.println(iBankAccount.getName() + " " + total2);

    }
}
