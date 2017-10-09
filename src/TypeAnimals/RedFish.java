package TypeAnimals;

public class RedFish extends Animals implements ISeaAnimals, IOviparous{


    public RedFish(String name, int sexe, double weight, double size, int age,
                   double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public RedFish() { }

    public void sound()
    {
        System.out.println("Bloubloublou");
    }

    public void move() { System.out.println("Swimming !");}

    @Override
    public IOviparous layAnEgg() {
        return null;
    }
}
