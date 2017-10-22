package TypeAnimals.TerrestrialsAnimals;

import TypeAnimals.Animals;
import TypeAnimals.AnimalsInterfaces.IMammal;
import TypeAnimals.AnimalsInterfaces.ITerrestrialsAnimals;
import TypeAnimals.Others.SexualType;

/**
 * This class modelize the class Bear
 * @author Romain Goffi
 */
public class Bear extends Animals implements ITerrestrialsAnimals, IMammal {

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
    public Bear(String name, SexualType sexe, double weight, double size, int age,
                double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Bear
     */
    public Bear()
    {
        this.name = "Bear";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*10;
        this.size = Math.random()*12;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }

    /**
     * Specific method sound for the class Bear
     */
    public void sound()
    {
        System.out.println("Wahouuu");
    }

    /**
     * Specific method move for the class Bear
     */
    public void move() { System.out.println("Running");}

    /**
     *
     * @return new animal (Bear)
     */
    @Override
    public IMammal giveBirth(String name)
    {
        if (this.getSexe() == SexualType.Female)
        {
            Bear bear = new Bear();
            return bear;
        }
        return null;
    }
}
