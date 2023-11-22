package act7p2;

public class MoveForwardCommand extends Command{
    public MoveForwardCommand(BeeBot beeBot) {
        super(beeBot);
    }

    @Override
    public void execute() {
        System.out.print("Moving Forward --> ");
        getBeeBot().move(10);
    }
}
