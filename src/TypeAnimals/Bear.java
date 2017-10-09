package TypeAnimals;

public class Bear extends Animals implements ITerrestrialsAnimals, IMammal {

    public Bear(String name, String sexe, double weight, double size, int age, double hungry, boolean sick, boolean sleep) {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("Wahouuu");
    }

    public void move() { System.out.println("Running");}

    @Override
    public IMammal giveBirth() { return null; }
}
