package TypeAnimals;

/**
 * This class modelize the class Shark
 * @author Romain Goffi
 */
public class Shark extends Animals implements ISeaAnimals, IOviparous{

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
    public Shark(String name, SexualType sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Shark
     */
    public Shark()
    {
        this.name = "Shark";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*5;
        this.size = Math.random()*10;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }

    /**
     * Specific method sound for the class Shark
     */
    public void sound()
    {
        System.out.println("Wahouuu");
    }

    /**
     * Specific method move for the class Shark
     */
    public void move()
    {
        System.out.println("Swimming");
    }

    /**
     *
     * @return new animal (Shark)
     */
    @Override
    public IOviparous layAnEgg()
    {
        if (timerGestation == 660)
        {
            return new Shark();
        }
        return null;
    }
}
