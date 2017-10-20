package TypeAnimals.SeaAnimals;

import TypeAnimals.Animals;
import TypeAnimals.AnimalsInterfaces.IOviparous;
import TypeAnimals.AnimalsInterfaces.ISeaAnimals;
import TypeAnimals.Others.SexualType;

/**
 * This class modelize the class RedFish
 * @author Romain Goffi
 */
public class RedFish extends Animals implements ISeaAnimals, IOviparous {

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
    public RedFish(String name, SexualType sexe, double weight, double size, int age,
                   double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class RedFish
     */
    public RedFish()
    {
        this.name = "RedFish";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*0.2;
        this.size = Math.random()*2;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }

    /**
     * Specific method sound for the class RedFish
     */
    public void sound()
    {
        System.out.println("Bloubloublou");
    }

    /**
     * Specific method move for the class RedFish
     */
    public void move() { System.out.println("Swimming !");}

    /**
     *
     * @return new animal (RedFish)
     */
    @Override
    public IOviparous layAnEgg()
    {
        if(timerGestation == 5)
        {
            return new RedFish();
        }
        return null;
    }
}
