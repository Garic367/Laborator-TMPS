package Creational_Patterns.Singleton;

public class Goalkeeper {
    private static Goalkeeper goalkeeper;
    private String name = "Keeper";
    public String getName(){
        return name;
    }

    //это статический метод, который используется для получения единственного экземпляра класса Goalkeeper
    // Если экземпляр еще не создан, то он создается, иначе возвращается уже существующий экземпляр.
    public static Goalkeeper getInstance(){
        if(goalkeeper == null){
            goalkeeper = new Goalkeeper();
        }
        return goalkeeper;
    }
}
