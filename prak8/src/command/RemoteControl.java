package command;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand undoCommand;

    public RemoteControl(int slots) {
        onCommands = new ICommand[slots];
        offCommands = new ICommand[slots];
        undoCommand = null;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
