package designPattern.command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Command command = new LightOnCommand(new Light());
        remoteControl.setCommand(command);
        remoteControl.press();
        command = new LightOffCommand(new Light());
        remoteControl.setCommand(command);
        remoteControl.press();
    }
}
