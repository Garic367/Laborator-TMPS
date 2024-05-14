package Behavioral_Patterns.State;


// Класс контекста - таймер
public class FootballTimer {
    private TimerState timerState;

    public void setTimerState(TimerState timerState) {
        this.timerState = timerState;
    }

    public void displayTimer() {
        timerState.displayTime();
    }
}