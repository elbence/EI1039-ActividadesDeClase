package act7p2.part1;

public class TurnLeftCommand extends Command{
    public TurnLeftCommand(BeeBot beeBot) {
        super(beeBot);
    }

    @Override
    public void execute() {
        System.out.print("Turning Left --> ");
        getBeeBot().rotate(-90);
    }
}
