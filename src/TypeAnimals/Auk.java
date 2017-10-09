package TypeAnimals;

public class Auk extends Animals implements ITerrestrialsAnimals, IOviparous, ISeaAnimals {

    public Auk(String name, String sexe, double weight, double size, int age,
               double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("Wahouuu");
    }

    public void move() { System.out.println("Running");}

    @Override
    public IOviparous layAnEgg() {
        return null;
    }
}
