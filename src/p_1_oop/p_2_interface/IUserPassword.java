package p_1_oop.p_2_interface;

public interface IUserPassword {
    /**
     * checks if old password and new password are same
     * @param uid
     * @param oldPassword
     * @param newPassword
     * @return boolean
     */
    boolean userPasswordChange( int uid, String oldPassword, String newPassword);

}
