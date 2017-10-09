package TypeAnimals;

public abstract class Animals {
    protected String name ="";
    protected int sexe = 0;
    protected double weight = 0.0;
    protected double size = 0.0;
    protected int age = 0;
    protected double hungry = 0.0;
    protected boolean mammal = false;
    protected boolean sleep = false;
    protected boolean sick = false;
    protected boolean gestation = false;

    public Animals(String name, int sexe, double weight, double size, int age, double hungry,
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
            if (gestation == true)
            {
                hungry = hungry + 0.3;
            }
            else { hungry = hungry + 0.5 ; }
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

    public void birth()
    {
        if(mammal == true && sexe == 2)
        {
            System.out.println(" Naissance de type normal");
        }
        else if (sexe == 2)
        {
            System.out.println("Naissance par oeufs");
        }
        else
        {
            System.out.println("Impossible car mâle");
        }

    }

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

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
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

    public boolean isGestation() {
        return gestation;
    }

    public void setGestation(boolean gestation) {
        this.gestation = gestation;
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
                    ", mammal=" + mammal +
                    ", sleep=" + sleep +
                    ", sick=" + sick +
                    ", gestation=" + gestation +
                    '}';
        }
    }
