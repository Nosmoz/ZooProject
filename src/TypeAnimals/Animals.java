package TypeAnimals;

public abstract class Animals {
    protected String name;
    protected int sexe;
    protected double weight;
    protected double size;
    protected int age;
    protected double hungry;
    protected boolean sleep;
    protected boolean sick ;

    public Animals(String name, int sexe, double weight, double size, int age,
                   double hungry, boolean sick, boolean sleep)
    {
        this.name = name;
        this.sexe = sexe;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.hungry = hungry;
        this.sick = sick;
        this.sleep = sleep;
    }

    public Animals()
    {
    }

    public void eat()
    {
        if (hungry > 0.5 || sleep == true)
        {
            System.out.println("Isn't the moment for eat");
        }
        else if (hungry <= 0.5 && sleep == false)
        {
            System.out.println("He can eat");
            hungry += 0.5;
        }
    }


    abstract void sound();

    public void cure()
    {
        if (sick == true)
        {
            sick = false;
            System.out.print("He been cured");
        }
    }

    public void stase()
    {
        if (sleep == false)
        {
            sleep = true;
            System.out.println("He start sleeping");
        }
        else
        {
            sleep = false;
        }
    }

    abstract void move();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHungry() {
        return hungry;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

        @Override
        public String toString() {
            return "Animals{" +
                    "name='" + name + '\'' +
                    ", sexe=" + sexe +
                    ", weight=" + weight +
                    ", size=" + size +
                    ", age=" + age +
                    ", hungry=" + hungry +
                    ", sleep=" + sleep +
                    ", sick=" + sick +
                    '}';
        }
    }
