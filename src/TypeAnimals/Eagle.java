package TypeAnimals;

/**
 * This class modelize the class Eagle
 * @author Romain Goffi
 */
public class Eagle extends Animals implements IFlyingAnimals, IOviparous {

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
    public Eagle(String name, SexualType sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Eagle
     */
    public Eagle()
    {
        this.name = "Eagle";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*4;
        this.size = Math.random()*6;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }


    /**
     * Specific method sound for the class Eagle
     */
    public void sound()
    {
        System.out.println("Wahouuu");
    }

    /**
     * Specific method move for the class Eagle
     */
    public void move() { System.out.println("Flying");}

    /**
     *
     * @return new animal (Eagle)
     */
    @Override
    public IOviparous layAnEgg() {
        if (timerGestation == 42)
        {
            return new Eagle();
        }
        return null;
    }
}
