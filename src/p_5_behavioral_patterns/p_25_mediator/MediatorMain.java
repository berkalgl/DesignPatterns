package p_5_behavioral_patterns.p_25_mediator;

public class MediatorMain {
    public static void main(String[] args) {

        IChatRoomMediator iChatRoomMediator = new ChatRoomMediatorImpl();

        User u1 = new ChatUser(iChatRoomMediator);
        u1.id = 1;
        u1.name = "Berk";

        User u2 = new ChatUser(iChatRoomMediator);
        u2.id = 2;
        u2.name = "Ali";

        User u3 = new ChatUser(iChatRoomMediator);
        u3.id = 3;
        u3.name = "Zehra";

        iChatRoomMediator.addUserToRoom(u1);
        iChatRoomMediator.addUserToRoom(u2);
        iChatRoomMediator.addUserToRoom(u3);

        u1.sendMessage("Hi Zehra", u3.id);
        u3.sendMessage("Hi Berk, How are u ?", u1.id);


    }
}
