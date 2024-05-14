package Structural_Patterns.Decorator;

import Structural_Patterns.Decorator.Ball;

// декоратор, добавляет цвет футбольному мячу
public class ColorDecorator implements Ball {
    private Ball football;
    private String color;

    public ColorDecorator(Ball football, String color) {
        this.football = football;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return football.getDescription() + ", color: " + color;
    }
}