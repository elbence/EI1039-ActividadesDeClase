package act7p2.part2;

public abstract class Command {
    private BeeBot beeBot;

    public Command(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    public BeeBot getBeeBot() {
        return beeBot;
    }

    public abstract void execute();
}
