package TypeAnimals;

public class Tiger extends Animals implements ITerrestrialsAnimals, IMammal {

    public Tiger(String name, String sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("Rahouuu");
    }
    public void move() { System.out.println("Running"); }

    @Override
    public IMammal giveBirth() {
        return null;
    }
}
