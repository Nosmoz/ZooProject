package TypeAnimals;


public class Wolf extends Animals implements ITerrestrialsAnimals, IMammal {

    public Wolf(String name, int sexe, double weight, double size, int age,
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
    public IMammal giveBirth() {
        return null;
    }
}
