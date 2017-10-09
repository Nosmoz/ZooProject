package Tests;


import TypeAnimals.Animals;
import TypeAnimals.Tiger;
import TypeAnimals.Wolf;
import TypeAnimals.Bear;

public class TestAnimals {


    public static void main(String[] args)
    {
        Bear John = new Bear("Kiwi", "F", 10, 140, 2, 1, true,false);
        John.toString();
        John.sound();
        John.getName();

    }

}
