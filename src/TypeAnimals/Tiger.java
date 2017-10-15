package TypeAnimals;

/**
 * This class modelize the class Tiger
 * @author Romain Goffi
 */
public class Tiger extends Animals implements ITerrestrialsAnimals, IMammal {

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
    public Tiger(String name, SexualType sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    /**
     * Birth Constructor for the class Tiger
     */
    public Tiger()
    {
        this.name = "Tiger";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*5;
        this.size = Math.random()*10;
        this.age = 0;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
    }


    /**
     * Specific method sound for the class Tiger
     */
    public void sound()
    {
        System.out.println("Rahouuu");
    }

    /**
     * Specific method move for the class Tiger
     */
    public void move() { System.out.println("Running"); }

    /**
     *
     * @return new animal (Tiger)
     */
    @Override
    public IMammal giveBirth() {
        if( timerGestation == 100 )
        {
            return new Tiger();
        }
        return null;
    }
}
