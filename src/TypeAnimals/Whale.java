package TypeAnimals;

public class Whale extends Animals implements ISeaAnimals, IMammal {

    public Whale(String name, String sexe, double weight, double size, int age,
                 double hungry, boolean sick, boolean sleep)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
    }

    public void sound()
    {
        System.out.println("ça fait un son beaucoups trop étrange");
    }

    public void move() { System.out.println("Swimming"); }

    @Override
    public IMammal giveBirth() {
        return null;
    }
}
