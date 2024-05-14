package Structural_Patterns.Composite;

import Structural_Patterns.Composite.TeamMember;

import java.util.ArrayList;
import java.util.List;

// Контейнер, представляющий команду
public class Team implements TeamMember {
    private List<TeamMember> members = new ArrayList<>();

    public void addMember(TeamMember member) {
        members.add(member);
    }

    @Override
    public void TeamInfo() {
        for (TeamMember member : members) {
            member.TeamInfo();
        }
    }
}
