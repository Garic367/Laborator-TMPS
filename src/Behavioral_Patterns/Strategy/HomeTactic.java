package Behavioral_Patterns.Strategy;

import Behavioral_Patterns.Strategy.FootballTactic;

// реализация стратегии для домашней игры
public class HomeTactic implements FootballTactic {
    @Override
    public void chooseTactic() {
        System.out.println("Home tactic: Dominance and more attacks \n");
    }
}

