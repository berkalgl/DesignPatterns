namespace OOP.Interface
{
    public class User : IUser, IUserPassword
    {
        public string UserProfileName(int uid)
        {
            if (uid == 5)
                return "Berk Algul";

            return String.Empty;
        }

        public int UserAge(int uid)
        {
            if(uid == 5)
                return 28;

            return 0;
        }

        public bool UserPasswordChange(int uid, string oldPassword, string newPassword)
        {
            return false;
        }
    }
}