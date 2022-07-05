package p_3_creational_patterns.p_8_factoryabstract;

import p_3_creational_patterns.p_8_factoryabstract.bank.BankTypeEnum;
import p_3_creational_patterns.p_8_factoryabstract.loan.LoanTypeEnum;

public class MainAbstract {
    public static void main(String[] args) {
        IAbstractFactory iAbstractFactory = new AbstractFactoryImpl();
        String loanType = iAbstractFactory.getLoan(LoanTypeEnum.Home).getType();
        System.out.println(loanType);

        String bankType = iAbstractFactory.getBank(BankTypeEnum.Garanti).getType();
        System.out.println(bankType);

    }
}
