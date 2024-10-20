package mediator;

public interface IMediator {
    void sendMessage(String message, IUser sender);
    void addUser(IUser user);
}
