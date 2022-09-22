namespace _04_factoryabstract_pattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IAbstractFactory iAbstractFactory = new AbstractFactory();
            String loanType = iAbstractFactory.getLoan(Loan.LoanTypes.HOME).Type();
            Console.WriteLine(loanType);

            String bankType = iAbstractFactory.getBank(Bank.BankTypes.GARANTI).Type();
            Console.WriteLine(bankType);
        }
    }
}