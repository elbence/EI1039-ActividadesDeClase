package act7p2.part1;

public class TurnRightCommand extends Command{
    public TurnRightCommand(BeeBot beeBot) {
        super(beeBot);
    }

    @Override
    public void execute() {
        System.out.print("Turning Right --> ");
        getBeeBot().rotate(90);
    }
}
