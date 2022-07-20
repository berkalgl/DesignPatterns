namespace OOP.Interface
{
    public interface IUserPassword
    {
        /// <summary>
        /// Implements <see cref="IUserPassword.UserPasswordChange(int, string, string)"/>
        /// </summary>
        /// <returns></returns>
        bool UserPasswordChange(int uid, string oldPassword, string newPassword);
    }
}