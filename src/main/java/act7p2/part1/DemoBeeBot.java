package act7p2.part1;

public class DemoBeeBot {
    public static void main(String[] args) {
        BeeBot beeBot = new BeeBot();
        GoButton goButton = new GoButton();
        Command command = new MoveForwardCommand(beeBot);
        goButton.setCommand(command);
        goButton.executeCommand();

        command = new TurnLeftCommand(beeBot);
        goButton.setCommand(command);
        goButton.executeCommand();

        command = new MoveForwardCommand(beeBot);
        goButton.setCommand(command);
        goButton.executeCommand();

        command = new MoveForwardCommand(beeBot);
        goButton.setCommand(command);
        goButton.executeCommand();

        command = new TurnRightCommand(beeBot);
        goButton.setCommand(command);
        goButton.executeCommand();
    }
}
