package Tests;


import TypeAnimals.TerrestrialsAnimals.Bear;
import TypeAnimals.FlyingAnimals.Eagle;
import TypeEnclosure.Enclosures;
import TypeAnimals.Others.SexualType;
import TypeAnimals.SeaAnimals.Whale;
import TypeEnclosure.Aquarium;
import TypeEnclosure.Aviary;

public class TestAnimals {


    public static void main(String[] args)
    {
        //Employer Joe = new Employer("Joe", SexualType.Male, 19);
        //Zoo Animali = new Zoo("Animali", Joe, 30);
        
        Bear john = new Bear("Bear", SexualType.Female, 10, 140, 2, 1, true,false);
        Whale willie = new Whale("willie", SexualType.Female, 10, 140, 2, 1, true,false);
        /*John.toString();
        John.sound();
        John.getName();*/
        Bear winnie = new Bear("Bear", SexualType.Male, 10, 140, 2, 1, true,false);
        
        Eagle fly = new Eagle("Eagle", SexualType.Female, 10, 14, 2, 1, true,false); 
        
        Enclosures bearEnclosure1 = new Enclosures("bearEnclosure1", 50, 10,"Bear");
        Aviary<Eagle> aviary = new Aviary("Aviary1", 50, 10, "Bear", 20);
        Aquarium<Whale> aqua = new Aquarium("Aquarium1", 50, 10, "Bear", 60);
        //aqua.addAnimal(fly);
        //System.out.println(aqua.getCleanliness());
        //System.out.println(aqua.getArea());
        //System.out.println(aqua.getDepth());
        bearEnclosure1.addAnimal(winnie);
        bearEnclosure1.addAnimal(john);
        //bearEnclosure1.addAnimal(Fly);
        //System.out.println(bearEnclosure1.toString());
        //System.out.println(bearEnclosure1.animalProperties());
        
    }

}
