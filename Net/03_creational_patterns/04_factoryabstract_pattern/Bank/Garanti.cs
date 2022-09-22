namespace _04_factoryabstract_pattern.Bank
{
    public class Garanti : IBank
    {
        public string Type()
        {
            return "Garanti BBVA";
        }
    }
}

