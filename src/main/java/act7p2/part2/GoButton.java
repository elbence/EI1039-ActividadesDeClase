package act7p2.part2;

import java.util.LinkedList;
import java.util.List;

public class GoButton {
    private final List<Command> commands;

    public GoButton() {
        commands = new LinkedList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        for(Command command : commands) command.execute();
    }

    public void deleteLastCommand() {
        commands.remove(commands.size()-1);
    }
}
