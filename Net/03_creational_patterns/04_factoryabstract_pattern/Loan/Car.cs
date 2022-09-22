using System;
namespace _04_factoryabstract_pattern.Loan
{
    public class Car : ILoan
    {
        public string Type()
        {
            return "Car";
        }
    }
}

