package behavioral.command;

public class LightInvoker {
    Command command;
    public LightInvoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void invoke() {
        command.execute();
    }
}
