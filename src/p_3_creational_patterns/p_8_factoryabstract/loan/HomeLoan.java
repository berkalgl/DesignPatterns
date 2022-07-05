package p_3_creational_patterns.p_8_factoryabstract.loan;

public class HomeLoan implements IBaseLoan {

    @Override
    public String getType() {
        return "Home";
    }
}
