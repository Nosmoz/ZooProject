package Tests;


import TypeAnimals.Animals;
import TypeAnimals.Tiger;
import TypeAnimals.Wolf;
import TypeAnimals.Bear;
import TypeAnimals.Eagle;
import TypeEnclosure.Enclosures;
import TypeAnimals.SexualType;
import TypeEnclosure.Aquarium;
import TypeEnclosure.Aviary;

public class TestAnimals {


    public static void main(String[] args)
    {
        Bear John = new Bear("Bear", SexualType.Female, 10, 140, 2, 1, true,false);
        John.toString();
        John.sound();
        John.getName();
        Bear Winnie = new Bear("Bear", SexualType.Male, 10, 140, 2, 1, true,false);
        
        Eagle Fly = new Eagle("Eagle", SexualType.Female, 10, 14, 2, 1, true,false); 
        
        Enclosures bearEnclosure1 = new Enclosures("bearEnclosure1", 50, 10,"Bear");
        Aviary aviary = new Aviary("Aviary1", 50, 10, "Bear");
        Aquarium aqua = new Aquarium("Aquarium1", 50, 10, "Bear", 60);
        //System.out.println(aqua.getCleanliness());
        //System.out.println(aqua.getArea());
        //System.out.println(aqua.getDepth());
        bearEnclosure1.addAnimal(Winnie);
        bearEnclosure1.addAnimal(John);
        //bearEnclosure1.addAnimal(Fly);
        //System.out.println(bearEnclosure1.toString());
        //System.out.println(bearEnclosure1.animalProperties());
        
    }

}
