package Structural_Patterns.Composite;

public class Players implements TeamMember {
    private String name;
    public Players(String name) {
        this.name = name;
    }

    @Override
    public void TeamInfo() {
        System.out.println("Player: " + name);
    }
}
