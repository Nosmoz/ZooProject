package Tests;


import TypeAnimals.Wolf;

public class TestAnimals {


    public static void main(String[] args)
    {

        Wolf John = new Wolf("Wolf", 0, 4.00,
                100, 2, 1, true,
                false, false, false);
        John.move();

    }

}
