package Behavioral_Patterns.State;

public class DuringMatchState implements TimerState{
    @Override
    public void displayTime() {
        System.out.println("Half time: 45 minuts left.");
    }
}
