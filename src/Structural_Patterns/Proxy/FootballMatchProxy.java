package Structural_Patterns.Proxy;

import Structural_Patterns.Proxy.FootballMatch;
import Structural_Patterns.Proxy.RealFootballMatch;

// Заместитель, ограничивающий доступ к информации о футбольных матчах
public class FootballMatchProxy implements FootballMatch {
    public RealFootballMatch realMatch;
    public String user;

    public FootballMatchProxy(String user) {
        this.user = user;
    }

    @Override
    public void displayMatchInfo() {
        if (user.equals("admin")) {
            realMatch = new RealFootballMatch("Match: Command A VS Command B \n");
            realMatch.displayMatchInfo();
        } else {
            System.out.println("Access denied: Should be admin ");
        }
    }
}
