package act7p2;

public class MoveBackwardCommand extends Command{
    public MoveBackwardCommand(BeeBot beeBot) {
        super(beeBot);
    }

    @Override
    public void execute() {
        System.out.print("Moving Backwards --> ");
        getBeeBot().move(-10);
    }
}
