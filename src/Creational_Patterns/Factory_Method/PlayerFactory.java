package Creational_Patterns.Factory_Method;

import Creational_Patterns.Factory_Method.Defender;
import Creational_Patterns.Factory_Method.Forward;
import Creational_Patterns.Factory_Method.Player;

// Фабрика для создания игроков
public class PlayerFactory {
    public static Player createPlayer(String type) {
        switch (type) {
            case "forward":
                return new Forward();
            case "defender":
                return new Defender();
            default:
                throw new IllegalArgumentException("unknown: " + type);
        }
    }
}