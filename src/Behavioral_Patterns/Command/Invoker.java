package Behavioral_Patterns.Command;
 public class Invoker {
     private Command command;

     public void setCommand(Command command) {
         this.command = command;
     }

     public void executeCommand() {
         command.execute();
     }
 }

