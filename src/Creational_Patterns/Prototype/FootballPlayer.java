package Creational_Patterns.Prototype;

public class FootballPlayer {
    public String name;
    public String age;
    public String position;

    public FootballPlayer clone(){
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.name = name;
        footballPlayer.age = age;
        footballPlayer.position = position;
        return footballPlayer;
    }
}
