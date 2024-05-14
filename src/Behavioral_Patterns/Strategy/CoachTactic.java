package Behavioral_Patterns.Strategy;

import Behavioral_Patterns.Strategy.FootballTactic;

public class CoachTactic {
    private FootballTactic tactic;

    public void setTactic(FootballTactic tactic) {
        this.tactic = tactic;
    }

    public void prepareForMatch() {
        if (tactic != null) {
            tactic.chooseTactic();
        } else {
            System.out.println("Don't set tactic for match.");
        }
    }
}

