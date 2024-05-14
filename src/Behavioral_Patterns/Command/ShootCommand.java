package Behavioral_Patterns.Command;

public class ShootCommand implements Command {
    private String player;

    public ShootCommand(String player) {
        this.player = player;
    }

    @Override
    public void execute() {
        System.out.println(player + "Kick on goal");
    }
}