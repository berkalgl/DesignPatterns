namespace OOP.Abstract{
    public class Person: Customer
    {
        private int number = 0;

        public Person(int number)
        {
            this.number = number;
        }

        public override int CustomerNum()
        {
            return number;
        }
    }
}