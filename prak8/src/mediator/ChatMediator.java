package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IMediator {
    private List<IUser> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    public void addUser(IUser user) {
        users.add(user);
    }

    public void sendMessage(String message, IUser sender) {
        for (IUser user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}