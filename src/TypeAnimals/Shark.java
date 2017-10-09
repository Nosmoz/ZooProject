package TypeAnimals;

public class Shark extends Animals implements ISeaAnimals, IOviparous{

    public Shark(String name, String sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("Wahouuu");
    }
    public void move() { System.out.println("Swimming");}

    @Override
    public IOviparous layAnEgg() {
        return null;
    }
}
