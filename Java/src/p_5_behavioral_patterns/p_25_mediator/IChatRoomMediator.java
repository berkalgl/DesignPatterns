package p_5_behavioral_patterns.p_25_mediator;

public interface IChatRoomMediator {

    void sendMessage(String message, int userId);
    void addUserToRoom(User user);

}
