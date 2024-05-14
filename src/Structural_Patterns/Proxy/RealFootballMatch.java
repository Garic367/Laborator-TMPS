package Structural_Patterns.Proxy;

import Structural_Patterns.Proxy.FootballMatch;

// Реальный сервис, предоставляющий информацию о футбольных матчах
class RealFootballMatch implements FootballMatch {
    private String matchInfo;

    public RealFootballMatch(String matchInfo) {
        this.matchInfo = matchInfo;
    }

    @Override
    public void displayMatchInfo() {
        System.out.println("Match info: " + matchInfo);
    }
}
