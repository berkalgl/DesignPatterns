package p_1_oop.p_2_interface;

public class UserImpl implements IUser, IUserPassword{
    @Override
    public String userProfileName(int uid) {
        if (uid == 5)
            return "Berk Algul";

        return null;
    }

    @Override
    public int userAge(int uid) {
        if (uid == 5)
            return 28;

        return 0;
    }

    @Override
    public boolean userPasswordChange(int uid, String oldPassword, String newPassword) {
        return false;
    }
}
