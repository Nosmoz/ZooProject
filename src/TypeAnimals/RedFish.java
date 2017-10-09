package TypeAnimals;

public class RedFish extends SeaAnimals{

    public RedFish(String name, int sexe, double weight, double size, int age, double hungry,
                boolean mammal, boolean sick, boolean sleep, boolean gestation)
    {
        this.name = name;
        this.sexe = sexe;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.hungry = hungry;
        this.mammal = mammal;
        this.sick = sick;
        this.sleep = sleep;
        this.gestation = gestation;
    }

    public RedFish() { }

    public void sound()
    {
        System.out.println("Bloubloublou");
    }
}
