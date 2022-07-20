namespace OOP.Abstract
{
    public abstract class Customer
    {
        public abstract int CustomerNum();

        public int Total()
        {
            if(CustomerNum() == 10)
                return 100000;

            return 0;
        }

        public string Name()
        {
            if(CustomerNum() == 10)
                return "Berk Algul";

            return String.Empty;
        }
    }
}