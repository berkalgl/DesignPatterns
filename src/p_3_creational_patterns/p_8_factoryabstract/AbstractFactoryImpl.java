package p_5_creational_patterns.p_8_factoryabstract;

import p_5_creational_patterns.p_8_factoryabstract.bank.BankTypeEnum;
import p_5_creational_patterns.p_8_factoryabstract.bank.GarantiBank;
import p_5_creational_patterns.p_8_factoryabstract.bank.IBaseBank;
import p_5_creational_patterns.p_8_factoryabstract.bank.IsBank;
import p_5_creational_patterns.p_8_factoryabstract.loan.CarLoan;
import p_5_creational_patterns.p_8_factoryabstract.loan.HomeLoan;
import p_5_creational_patterns.p_8_factoryabstract.loan.IBaseLoan;
import p_5_creational_patterns.p_8_factoryabstract.loan.LoanTypeEnum;

public class AbstractFactoryImpl implements IAbstractFactory{


    @Override
    public IBaseLoan getLoan(LoanTypeEnum type) {
        switch (type){
            case  Car : return new CarLoan();
            case Home : return new HomeLoan();
            default :
                throw new RuntimeException("Type Could not be found");
        }
    }

    @Override
    public IBaseBank getBank(BankTypeEnum type) {
        switch (type){
            case Garanti : return new GarantiBank();
            case Isbank : return new IsBank();
            default :
                throw new RuntimeException("Type Could not be found");
        }
    }
}
