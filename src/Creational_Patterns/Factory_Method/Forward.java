package Creational_Patterns.Factory_Method;

// Класс для создания нападающих
class Forward implements Player {
    @Override
    public void play()
    {
        System.out.println("Forward makes goal! \n");
    }
}