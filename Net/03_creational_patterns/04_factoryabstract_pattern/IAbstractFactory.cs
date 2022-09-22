using _04_factoryabstract_pattern.Bank;
using _04_factoryabstract_pattern.Loan;

namespace _04_factoryabstract_pattern
{
    public interface IAbstractFactory
    {
        ILoan getLoan(LoanTypes type);
        IBank getBank(BankTypes type);
    }
}

