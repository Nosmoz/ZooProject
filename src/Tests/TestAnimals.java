package Tests;


import TypeAnimals.Animals;
import TypeAnimals.Tiger;
import TypeAnimals.Wolf;
import TypeAnimals.Bear;
import TypeAnimals.Eagle;
import TypeEnclosure.Enclosures;

public class TestAnimals {


    public static void main(String[] args)
    {
        Bear John = new Bear("Bear", "F", 10, 140, 2, 1, true,false);
        John.toString();
        John.sound();
        John.getName();
        Bear Winnie = new Bear("Bear", "M", 10, 140, 2, 1, true,false);
        
        Eagle Fly = new Eagle("Eagle", "M", 10, 14, 2, 1, true,false); 
        
        Enclosures bearEnclosure1 = new Enclosures("bearEnclosure1", 50, 10,"Bear");
        bearEnclosure1.addAnimal(Winnie);
        bearEnclosure1.addAnimal(John);
        //bearEnclosure1.addAnimal(Fly);
        //System.out.println(bearEnclosure1.toString());
        System.out.println(bearEnclosure1.animalProperties());
        
    }

}
