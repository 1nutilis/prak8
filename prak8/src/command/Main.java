package command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(2);

        Light livingRoomLight = new Light();


        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);



        remote.setCommand(0, lightOn, lightOff);


        System.out.println("Управление светом:");
        remote.pressOnButton(0);
        remote.pressOffButton(0);
        remote.pressUndoButton();
    }
}
