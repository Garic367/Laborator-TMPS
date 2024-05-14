package Behavioral_Patterns.Command;

public class PassCommand implements Command {
    private String player;

    public PassCommand(String player) {
        this.player = player;
    }

    @Override
    public void execute() {
        System.out.println(player + "Pass to another player");
    }
}
