package p_4_structural_patterns.p_17_proxy;

public class DifferentAccountProxy implements IBankAccount{

    private IBankAccount _bankAccount;

    public DifferentAccountProxy(IBankAccount _bankAccount) {
        this._bankAccount = _bankAccount;
    }

    @Override
    public int withdrawMoney(int quantity) {
        return this._bankAccount.withdrawMoney(quantity);
    }

    @Override
    public void depositMoney(int quantity) {
        this._bankAccount.depositMoney(quantity);
    }

    @Override
    public String getName() {
        return this._bankAccount.getName();
    }

    @Override
    public void setName(String name) {
        this._bankAccount.setName(name);
    }
}
