package mediator;

public class Main {
    public static void main(String[] args) {
        IMediator mediator = new ChatMediator();

        IUser alice = new User(mediator, "Алиса");
        IUser bob = new User(mediator, "Боба");
        IUser semen = new User(mediator, "Семен");

        mediator.addUser(alice);
        mediator.addUser(bob);
        mediator.addUser(semen);

        alice.sendMessage("Привет всем!");
        bob.sendMessage("Привет, Алиса!");
    }
}