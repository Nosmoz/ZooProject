package ProjetZoo;

import TypeAnimals.SexualType;
import TypeEnclosure.Enclosures;

public class Employer {

    private String name;
    private SexualType sexe;
    private int age;
    private Enclosures enclosure;

    public Employer(String name, SexualType sexe, int age)
    {
        this.name = name;
        this.sexe = sexe;
        this.age = age;
    }
    
    public void cleanEnclosure(Enclosures enclosure)
    {
        if(enclosure.isCleanable())
        {
            enclosure.setCleanliness(1);
            System.out.println("Enclosure clean");
        }
    }

    public void examineEnclosure(Enclosures enclosure)
    {
        System.out.println(enclosure.toString());
        enclosure.animalProperties();
    }
    
    public void feedAnimals(Enclosures enclosure)
    {
        enclosure.feedAnimal();
        System.out.println("Animals feed");
    }

    public void changeAnimalsEnclosure(Enclosures enclosure)
    {
        System.out.println("changement good");
    }

}
