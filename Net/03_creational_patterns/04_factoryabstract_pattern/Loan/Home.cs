using System;
namespace _04_factoryabstract_pattern.Loan
{
    public class Home : ILoan
    {
        public string Type()
        {
            return "Home";
        }
    }
}

