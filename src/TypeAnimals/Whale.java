package TypeAnimals;

/**
 * This class modelize the class Whale
 * @author Romain Goffi
 */
public class Whale extends Animals implements ISeaAnimals, IMammal {

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
    public Whale(String name, SexualType sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Whale
     */
    public Whale()
    {
        this.name = "Wolf";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*20;
        this.size = Math.random()*10;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }

    /**
     * Specific method sound for the class Whale
     */
    public void sound()
    {
        System.out.println("ça fait un son beaucoups trop étrange");
    }

    /**
     * Specific method move for the class Whale
     */
    public void move() { System.out.println("Swimming"); }

    /**
     *
     * @return new animal (Whale)
     */
    @Override
    public IMammal giveBirth()
    {
        if (timerGestation == 390)
        {
            return new Whale();
        }
        return null;
    }
}
