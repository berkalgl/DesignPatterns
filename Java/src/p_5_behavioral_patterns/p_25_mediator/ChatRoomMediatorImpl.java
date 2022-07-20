package p_5_behavioral_patterns.p_25_mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomMediatorImpl implements IChatRoomMediator{

    private Map<Integer, User> map = new HashMap<>();

    @Override
    public void sendMessage(String message, int userId) {
        map.get(userId).receiveMessage(message);
    }

    @Override
    public void addUserToRoom(User user) {
        map.put(user.id, user);
    }
}
