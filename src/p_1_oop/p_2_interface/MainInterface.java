package p_1_oop.p_2_interface;

public class MainInterface {
    public static void main(String[] args){

        //filtering
        UserImpl user = new UserImpl();
        IUserPassword userPassword = new UserImpl();
        IUser iUser = new UserImpl();

        userPassword.userPasswordChange(10, "","");

        // get methods and attributes of implemented class from interface
        // instanceOf
        if ( userPassword instanceof UserImpl)
        {
            UserImpl newUser = (UserImpl) userPassword;
            newUser.userAge(10);
        }
    }
}
