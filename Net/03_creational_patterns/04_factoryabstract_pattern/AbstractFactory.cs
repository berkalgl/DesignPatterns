using _04_factoryabstract_pattern.Bank;
using _04_factoryabstract_pattern.Loan;

namespace _04_factoryabstract_pattern
{
    public class AbstractFactory : IAbstractFactory
    {
        public IBank getBank(BankTypes type)
        {
            switch (type)
            {
                case BankTypes.GARANTI: return new Garanti();
                case BankTypes.ISBANK: return new IsBank();
                default:
                    throw new Exception("Type Could not be found");
            }
        }

        public ILoan getLoan(LoanTypes type)
        {
            switch (type)
            {
                case LoanTypes.CAR: return new Car();
                case LoanTypes.HOME: return new Home();
                default:
                    throw new Exception("Type Could not be found");
            }
        }
    }
}

