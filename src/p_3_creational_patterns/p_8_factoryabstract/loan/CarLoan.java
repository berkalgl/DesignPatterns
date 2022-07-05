package p_5_creational_patterns.p_8_factoryabstract.loan;

public class CarLoan implements IBaseLoan{

    @Override
    public String getType() {
        return "Car";
    }
}
