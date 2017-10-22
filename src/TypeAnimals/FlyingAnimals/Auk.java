package TypeAnimals.FlyingAnimals;

import TypeAnimals.Animals;
import TypeAnimals.AnimalsInterfaces.IOviparous;
import TypeAnimals.AnimalsInterfaces.ISeaAnimals;
import TypeAnimals.AnimalsInterfaces.ITerrestrialsAnimals;
import TypeAnimals.Others.SexualType;

/**
 * This class modelize the class Auk
 * @author Romain Goffi
 */
public class Auk extends Animals implements ITerrestrialsAnimals, IOviparous, ISeaAnimals {

    /**
     * Constructor for the class Animals
     * @param name
     * @param sexe
     * @param weight
     * @param size
     * @param age
     * @param hungry
     * @param sick
     * @param sleep
     */
    public Auk(String name, SexualType sexe, double weight, double size, int age,
               double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Auk
     */
    public Auk()
    {
        this.name = "Auk";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*2;
        this.size = Math.random()*3;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }

    /**
     * Specific method sound for the class Auk
     */
    public void sound()
    {
        System.out.println("Wahouuu");
    }

    /**
     * Specific method move for the class Auk
     */
    public void move() { System.out.println("Running");}

    /**
     *
     * @return new Animal (Auk)
     */
    @Override
    public IOviparous layAnEgg()
    {
        if(this.getSexe() == SexualType.Female)
        {
            Auk auk = new Auk();
            return auk;
        }
        return null;
    }
}
