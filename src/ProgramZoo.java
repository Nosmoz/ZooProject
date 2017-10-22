import ProjetZoo.Employer;
import ProjetZoo.Zoo;
import TypeAnimals.Animals;
import TypeAnimals.SeaAnimals.Shark;
import TypeAnimals.TerrestrialsAnimals.Bear;
import TypeAnimals.FlyingAnimals.Eagle;
import TypeAnimals.TerrestrialsAnimals.WolfProject.AgeType;
import TypeAnimals.TerrestrialsAnimals.WolfProject.RankWolf;
import TypeAnimals.TerrestrialsAnimals.WolfProject.Wolf;
import TypeEnclosure.Enclosures;
import TypeAnimals.Others.SexualType;
import TypeAnimals.SeaAnimals.Whale;
import TypeEnclosure.Aquarium;
import TypeEnclosure.Aviary;
import java.util.Scanner;

public class ProgramZoo
{
    private static Scanner sc = new Scanner(System.in);
    private static Employer enzo = new Employer("enzo",SexualType.Male, 21 );
    private static Zoo ponyland = new Zoo("ponyland", enzo, 5);

    public static void main(String[] args)
    {
        Animals oursonKiwi = new Bear("Bear", SexualType.Male, 10, 20, 2, 1, false, false );
        Animals padreWolf = new Wolf("Wolf", SexualType.Male, 40, 120, 8, 1, false, false, 10, RankWolf.alpha, 3, AgeType.Adult);

        Enclosures<Bear> bearEnclosure1 = new Enclosures("bearEnclosure1", 50, 10,"Bear");
        Enclosures<Wolf> wolfEnclosure1 = new Enclosures("wolfEnclosure1", 20, 4, "Wolf");
        Aviary<Eagle> aviary1 = new Aviary("Aviary1", 50, 10, "Eagle", 20);
        Aquarium<Whale> aqua1 = new Aquarium("Aquarium1", 50, 10, "Shark", 200);
        ponyland.addEnclosure(bearEnclosure1);
        ponyland.addEnclosure(wolfEnclosure1);
        ponyland.addEnclosure(aviary1);
        ponyland.addEnclosure(aqua1);

        bearEnclosure1.addAnimal(oursonKiwi);
        wolfEnclosure1.addAnimal(padreWolf);

        Animals sharkEater = new Shark("Shark", SexualType.Female, 50, 180, 15, 1, true, false );
        wolfEnclosure1.addAnimal(sharkEater);

        aqua1.addAnimal(sharkEater);

        System.out.println("Animals move and generate sounds");
        sharkEater.sound();
        sharkEater.move();
        padreWolf.sound();
        oursonKiwi.move();

        int turn = 0;
        while (true)
        {
            turn += 1;
            System.out.println("                                ");
            System.out.println("                                ");
            System.out.println("      It's your turn Yugi !     ");

            System.out.println("Would you know the properties of your animals ?");
            //if the user write yes, he can see all informations about animals
            String user = sc.nextLine();
            if (user.equals("yes"))
            {
                ponyland.allAnimal();
            }

            System.out.println(" Would you feed animal ? ");
            //if the user write yes, he can create enclosure, if the zoo have the size for
            if(user.equals("yes"))
            {
                System.out.println("What enclosure would you feed ?");
                ponyland.allEnclosure();
                String enclosureName = sc.nextLine();
            }

            if (turn % 2 == 0)
            {
                padreWolf.setSleep(true);
                padreWolf.setSick(true);
            }


        }

    }
}
