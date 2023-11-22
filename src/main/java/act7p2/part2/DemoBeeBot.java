package act7p2.part2;

public class DemoBeeBot {
    public static void main(String[] args) {
        BeeBot beeBot = new BeeBot();
        GoButton goButton = new GoButton();
        goButton.setCommand(new MoveForwardCommand(beeBot));
        goButton.setCommand(new TurnLeftCommand(beeBot));
        goButton.setCommand(new MoveForwardCommand(beeBot));
        goButton.setCommand(new MoveForwardCommand(beeBot));
        goButton.setCommand(new TurnRightCommand(beeBot));
        goButton.executeCommand();
        System.out.println("------- Delete last 2 -------");
        goButton.deleteLastCommand();
        goButton.deleteLastCommand();
        goButton.executeCommand();
    }
}
