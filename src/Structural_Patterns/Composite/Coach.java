package Structural_Patterns.Composite;

import Structural_Patterns.Composite.TeamMember;

// Лист, представляющий тренера
public class Coach implements TeamMember {
    private String name;

    public Coach(String name) {
        this.name = name;
    }

    @Override
    public void TeamInfo() {
        System.out.println("Coach: " + name);
    }
}
