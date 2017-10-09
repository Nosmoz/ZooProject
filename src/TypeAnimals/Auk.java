package TypeAnimals;

public class Auk extends Animals implements ITerrestrialsAnimals, IOviparous, ISeaAnimals {

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
