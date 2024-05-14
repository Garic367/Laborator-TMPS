package Behavioral_Patterns.Strategy;

import Behavioral_Patterns.Strategy.FootballTactic;

// реализация стратегии для гостевой игры
public class AwayTactic implements FootballTactic {
    @Override
    public void chooseTactic() {
        System.out.println("Away tactic: Defensive game tactic \n");
    }
}