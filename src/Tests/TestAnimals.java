package Tests;


import ProjetZoo.Employer;
import ProjetZoo.Zoo;
import TypeAnimals.TerrestrialsAnimals.Bear;
import TypeAnimals.FlyingAnimals.Eagle;
import TypeEnclosure.Enclosures;
import TypeAnimals.Others.SexualType;
import TypeAnimals.SeaAnimals.Whale;
import TypeEnclosure.Aquarium;
import TypeEnclosure.Aviary;
import java.util.Scanner;

public class TestAnimals {
    

    public static void main(String[] args)
    {
        Employer employer = new Employer("Joe", SexualType.Male, 19);
        Zoo zoo = new Zoo("Animali", employer, 30);
        
        /*Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom :");
        String nameEmployer = sc.nextLine();
        System.out.print("Veuillez saisir votre age :");
        int age = sc.nextInt();
        System.out.println("Etes-vous un homme ou une femme ?");
        SexualType value = SexualType.getRandom();
        System.out.println("Veuillez saisir votre nom de votre zoo :");
        String nameZoo = sca.nextLine();
        System.out.print("Veuillez saisir votre le nombre max d'enclos de votre zoo :");
        int nbrEnclosure = sc.nextInt();
        
        Employer employer = new Employer(nameEmployer, value, age);
        Zoo zoo = new Zoo(nameZoo, employer, nbrEnclosure);*/
        
        Bear john = new Bear("Bear", SexualType.Female, 10, 140, 2, 1, true,false);
        //Whale willie = new Whale("willie", SexualType.Female, 10, 140, 2, 1, true,false);
        /*John.toString();
        John.sound();
        John.getName();*/
        Bear winnie = new Bear("Bear", SexualType.Male, 10, 140, 2, 1, true,false);
        
        //Eagle fly = new Eagle("Eagle", SexualType.Female, 10, 14, 2, 1, true,false); 
        
        Enclosures<Bear> bearEnclosure1 = new Enclosures("bearEnclosure1", 50, 10,"Bear");
        //Aviary<Eagle> aviary = new Aviary("Aviary1", 50, 10, "Bear", 20);
        //Aquarium<Whale> aqua = new Aquarium("Aquarium1", 50, 10, "Bear", 60);
        //aqua.addAnimal(fly);
        zoo.addEnclosure(bearEnclosure1);
        
        String str = winnie.getClass().getName();
        String [] arrOfStr = str.split("\\.");
        
        //get the class of the Bear object
        System.out.println(arrOfStr[2]);
        //get the type of enclosure
        System.out.println(bearEnclosure1.getType());
        
        //System.out.println(aqua.getCleanliness());
        //System.out.println(aqua.getArea());
        //System.out.println(aqua.getDepth());
        
        bearEnclosure1.addAnimal(winnie);
        bearEnclosure1.addAnimal(john);
        
        //bearEnclosure1.addAnimal(Fly);
        //System.out.println(bearEnclosure1.toString());
        System.out.println(bearEnclosure1.animalProperties());
        
    }

}
