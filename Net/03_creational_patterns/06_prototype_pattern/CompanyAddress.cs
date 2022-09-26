namespace _06_prototype_pattern
{
    public class CompanyAddress : AddressPrototype
    {
        private string workNum;

        public CompanyAddress(string workNum, string city)
        {
            setCity(city);
            this.workNum = workNum;
        }

        public string getWorkNum()
        {
            return workNum;
        }

        public void setWorkNum(string workNum)
        {
            this.workNum = workNum;
        }
    }
}

