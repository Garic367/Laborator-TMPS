package Structural_Patterns.Decorator;

import Structural_Patterns.Decorator.Ball;

// Реализация базового футбольного мяча
public class BasicBall implements Ball {
    @Override
    public String getDescription() {
        return "Default ball";
    }
}