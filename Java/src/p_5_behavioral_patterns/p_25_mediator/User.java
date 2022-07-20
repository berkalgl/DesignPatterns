package p_5_behavioral_patterns.p_25_mediator;

public abstract class User {

    public int id;
    public String name;

    private IChatRoomMediator iChatRoomMediator;

    public User(IChatRoomMediator iChatRoomMediator) {
        this.iChatRoomMediator = iChatRoomMediator;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " - " + message);
    }

    public void sendMessage(String message, int userId){
        System.out.println(" new message : " + name + " - " + message);
        iChatRoomMediator.sendMessage(message, userId);
    }
}
