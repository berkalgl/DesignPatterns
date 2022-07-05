package p_3_creational_patterns.p_8_factoryabstract;

import p_3_creational_patterns.p_8_factoryabstract.bank.BankTypeEnum;
import p_3_creational_patterns.p_8_factoryabstract.bank.IBaseBank;
import p_3_creational_patterns.p_8_factoryabstract.loan.IBaseLoan;
import p_3_creational_patterns.p_8_factoryabstract.loan.LoanTypeEnum;

public interface IAbstractFactory {
    IBaseLoan getLoan(LoanTypeEnum type);
    IBaseBank getBank(BankTypeEnum type);
}
