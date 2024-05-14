package Behavioral_Patterns.State;

public class AfterMatchState implements TimerState{
    @Override
    public void displayTime() {
        System.out.println("The match is over, 90 minutes have passed. \n");
    }
}
