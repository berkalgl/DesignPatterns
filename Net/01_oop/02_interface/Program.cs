namespace OOP.Interface
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //Filtering
            User user = new();
            IUserPassword userPassword = new User();
            IUser iUser = new User();

            userPassword.UserPasswordChange(10, "","");

            //get methods and attributes of implemented class from interface
            if (userPassword is User)
            {
                User newUser = (User)userPassword;
                newUser.UserAge(10);
            }
        }
    }
}