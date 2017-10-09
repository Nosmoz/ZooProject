package TypeAnimals;

public class Eagle extends Animals implements IFlyingAnimals, IOviparous {

    public Eagle(String name, int sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("Wahouuu");
    }

    public void move() { System.out.println("Flying");}

    @Override
    public IOviparous layAnEgg() {
        return null;
    }
}
