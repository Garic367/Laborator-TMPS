package Creational_Patterns.Factory_Method;

// Класс для создания защитников
class Defender implements Player {
    @Override
    public void play() {
        System.out.println("Defender block attaks \n");
    }
}