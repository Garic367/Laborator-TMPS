import Behavioral_Patterns.Command.Command;
import Behavioral_Patterns.Command.Invoker;
import Behavioral_Patterns.Command.PassCommand;
import Behavioral_Patterns.Command.ShootCommand;
import Behavioral_Patterns.State.AfterMatchState;
import Behavioral_Patterns.State.BeforeMatchState;
import Behavioral_Patterns.State.DuringMatchState;
import Behavioral_Patterns.State.FootballTimer;
import Behavioral_Patterns.Strategy.AwayTactic;
import Behavioral_Patterns.Strategy.CoachTactic;
import Creational_Patterns.Builder.FootballTeam;
import Creational_Patterns.Prototype.FootballPlayer;
import Creational_Patterns.Singleton.Goalkeeper;
import Creational_Patterns.Factory_Method.Player;
import Creational_Patterns.Factory_Method.PlayerFactory;
import Structural_Patterns.Composite.Coach;
import Structural_Patterns.Composite.Players;
import Structural_Patterns.Composite.Team;
import Structural_Patterns.Decorator.Ball;
import Structural_Patterns.Decorator.BasicBall;
import Structural_Patterns.Decorator.ColorDecorator;
import Structural_Patterns.Proxy.FootballMatch;
import Structural_Patterns.Proxy.FootballMatchProxy;

public class Main {
    public static void main(String[] args) {

        //Factory method
        System.out.println("1.Creational - 1.1 Factory Method example");
        Player forward = PlayerFactory.createPlayer("forward");
        forward.play();

        //Singleton
        // проверяем, что coach1 и coach2 ссылаются на один и тот же объект
        System.out.println("1.Creational - 1.2 Singleton example");
        Goalkeeper goalkeeper1 = Goalkeeper.getInstance();
        System.out.println("Goalkeeper 1: " + goalkeeper1.getName());
        Goalkeeper goalkeeper2 = Goalkeeper.getInstance();
        System.out.println("Goalkeeper 2: " + goalkeeper2.getName() + "\n");


        //Builder
        System.out.println("1.Creational - 1.3 Builder example");
        FootballTeam footballTeam = new FootballTeam.Builder()
                .name("FC Team")
                .coach("BestCoach")
                .numberOfPlayers(11)
                .build();

        System.out.println("Team name: " + footballTeam.getName());
        System.out.println("Coach name: " + footballTeam.getCoach());
        System.out.println("Number of players: " + footballTeam.getNumberOfPlayers() + "\n");

        //Prototype
        System.out.println("1.Creational - 1.4 Prototype example");
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.name = "PlayerX";
        footballPlayer.age = "30";
        footballPlayer.position = "forward";

        //клонирование FootballPlayer
        FootballPlayer footballPlayer2 = footballPlayer.clone();
        System.out.println("Name: " + footballPlayer2.name);
        System.out.println("Age: " + footballPlayer2.age);
        System.out.println("Position: " + footballPlayer2.position + "\n");


        //Structural - Decorator
        System.out.println("2.Structural - 2.1 Decorator");
        Ball basicBall = new BasicBall();
        // добавляем цвет к мячу с помощью декоратора
        Ball ballWithColor = new ColorDecorator(basicBall, "white");
        System.out.println("Without decorator: " + basicBall.getDescription());
        System.out.println("With decorator: " + ballWithColor.getDescription() + "\n");


        //Structural - Composite
        System.out.println("2.Structural - 2.2 Composite");
        System.out.println("Team:");
        Players players1 = new Players("Player 1");
        Players players2 = new Players("Player 2");
        Players players3 = new Players("Player 3");

        Coach coach = new Coach("BestCoach \n");
        // cоздаем команду и добавляем в нее игроков и тренера
         Team team = new Team();
         team.addMember(players1);
         team.addMember(players2);
         team.addMember(players3);
         team.addMember(coach);
        // вывод информацию о команде
          team.TeamInfo();

        // Structural - Proxy
        System.out.println("2.Structural - 2.3 Proxy");
        // Создал proxy для пользователя
        FootballMatch matchProxy = new FootballMatchProxy("admin");
        matchProxy.displayMatchInfo();

        //Behavioral - Strategy
        System.out.println("3.Behavioral - 3.1 Strategy");
        CoachTactic CoachTactic = new CoachTactic();
        CoachTactic.setTactic(new AwayTactic());
        CoachTactic.prepareForMatch();
        CoachTactic.setTactic(new AwayTactic());


        //Behavioral - State
        System.out.println("3.Behavioral - 3.2 State");
        FootballTimer timer = new FootballTimer();
        timer.setTimerState(new BeforeMatchState());
        timer.displayTimer();
        timer.setTimerState(new DuringMatchState());
        timer.displayTimer();
        timer.setTimerState(new AfterMatchState());
        timer.displayTimer();


        //Behavioral - Command
        System.out.println("3.Behavioral - 3.3 Command");
        // создал команды
        Command passCommand = new PassCommand("Player A ");
        Command shootCommand = new ShootCommand("Player B ");
        // создал инициатора команд
        Invoker invoker = new Invoker();
        invoker.setCommand(passCommand);
        invoker.executeCommand();
        invoker.setCommand(shootCommand);
        invoker.executeCommand();

    }
}
