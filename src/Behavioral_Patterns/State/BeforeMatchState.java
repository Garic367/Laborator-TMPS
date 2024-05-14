package Behavioral_Patterns.State;

public class BeforeMatchState implements TimerState{
    @Override
    public void displayTime() {
        System.out.println("Before match state: 90 minuts left.");
    }
}
