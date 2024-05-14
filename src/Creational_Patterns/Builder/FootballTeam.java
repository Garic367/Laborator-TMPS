package Creational_Patterns.Builder;

public class FootballTeam {
    private String name;
    private String coach;
    private int numberOfPlayers;

    private FootballTeam(Builder builder) {
        this.name = builder.name;
        this.coach = builder.coach;
        this.numberOfPlayers = builder.numberOfPlayers;
    }


    public String getName() {
        return name;
    }

    public String getCoach() {
        return coach;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public static class Builder {
        private String name;
        private String coach;
        private int numberOfPlayers;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder coach(String coach) {
            this.coach = coach;
            return this;
        }

        public Builder numberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
            return this;
        }

        // Метод для построения объекта FootballTeam
        public FootballTeam build() {
            return new FootballTeam(this);
        }
    }
}