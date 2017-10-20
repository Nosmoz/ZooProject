package TypeAnimals.TerrestrialsAnimals.WolfProject;

import TypeAnimals.*;
import TypeAnimals.AnimalsInterfaces.IMammal;
import TypeAnimals.AnimalsInterfaces.ITerrestrialsAnimals;
import TypeAnimals.Others.SexualType;

/**
 * This class modelize the class Wolf
 * @author Romain Goffi
 */
public class Wolf extends Animals implements ITerrestrialsAnimals, IMammal {

    private int strenght;
    private double factorDomination;
    private AgeType ageType;
    public RankWolf rank;
    private int level;
    private int impetuous;
    private WolfPack hounds;
    private boolean failFightVsAlphaMale;
    /**
     * Constructor for the class Animals with new Wolf's elements.
     * @param name
     * @param sexe
     * @param weight
     * @param size
     * @param age
     * @param hungry
     * @param sick
     * @param sleep
     * @param strenght
     * @param rank
     * @param level
     * @param impetuous
     * @param ageType
     */
    public Wolf(String name, SexualType sexe, double weight, double size, int age,
                double hungry, boolean sick, boolean sleep, int strenght, RankWolf rank,
                int level, int impetuous, AgeType ageType)
    {
        super(name, sexe, weight, size, age, hungry, sick, sleep);
        this.strenght = strenght;
        this.rank = rank;
        this.level = level;
        this.impetuous = impetuous;
        this.ageType = ageType;
        this.factorDomination = 0;
        this.failFightVsAlphaMale = false;
    }

    /**
     * Birth Constructor for the class Wolf
     */
    public Wolf()
    {
        this.name = "Wolf";
        this.sexe = sexe.getRandom();
        this.weight = Math.random()*5;
        this.size = Math.random()*10;
        this.age = 1;
        this.hungry = 1;
        this.sick = false;
        this.sleep = false;
        this.strenght = 1;
        this.rank = RankWolf.alpha;
        this.level = 1;
        this.impetuous = 1;
        this.ageType = AgeType.Young;
        this.factorDomination = 0;
        /* this.hounds =; */
        this.failFightVsAlphaMale = false;
    }

    /**
     * method to calculate the level of wolf
     */
    public int calculateLevel()
    {
        if (this.getSexe() == SexualType.Male )
            level = 1;
        else
            level = (int) 0.5;
        if (this.getAgeType() == AgeType.Young )
            level += 0.15;
        else if (this.getAgeType() == AgeType.Young)
            level += 0.2;
        else
            level += 0.1;

        if(this.getRank() == RankWolf.omega || this.getHounds() == null)
        {
            level *= strenght;
        }
        else
        {
            level *= strenght + factorDomination;
        }

        if (this.getRank().getValue() <= 5 )
        {
            level *= 0.8;
        }
        else if (this.getRank().getValue() > 5 && this.getRank().getValue() <= 10)
        {
            level *= 0.6;
        }
        else if (this.getRank().getValue() > 10 && this.getRank().getValue() <= 20)
        {
            level *= 0.5;
        }
        else if (this.getRank().getValue() > 20 && this.getRank().getValue() < 24)
        {
            level *= 0.4;
        }
        else { level *=0.3; }
        return level;
    }

    /**
     * Specific method move for the class Wolf
     */
    public void move() { System.out.println("Running");}


    /**
     * methode to hear the Wolf's yell
     */
    public void hearYell()
    {
        if (sleep == false && sick == false)
        {
            System.out.println("I can hear a yell");
        }
    }

    /**
     * Method to know if the wolf die (if he's old)
     */
    public void growOld()
    {
        if (this.getAgeType() == ageType.Young && this.getAge() >= 5)
        {
            System.out.println("The wolf evolve, he becomes adult");
            this.ageType = AgeType.Adult;
        }
        else if (this.getAgeType() == ageType.Adult && this.getAge() >= 10)
        {
            System.out.println("The wolf evolve, he becomes old");
            this.ageType = AgeType.Old;
        }

        else if (this.getAgeType() == AgeType.Old && this.getAge() >= 15)
        {
            System.out.println("The wolf die of old age");
        }
    }

    /**
     *
     * @return new animal (Wolf)
     */
    @Override
    public IMammal giveBirth() {
        if (timerGestation == 70)
        {
            return new Wolf();
        }
        return null;
    }

    /**
     *
     * @return caracteristiques for wolf
     */
    @Override
    public String toString() {
        return "Wolf{" +
                "strenght=" + strenght +
                ", rank=" + rank +
                ", level=" + level +
                ", impetuous=" + impetuous +
                ", hounds='" + hounds + '\'' +
                ", sexe=" + sexe +
                ", weight=" + weight +
                ", size=" + size +
                ", age=" + age +
                ", timerGestation=" + timerGestation +
                ", hungry=" + hungry +
                ", sleep=" + sleep +
                ", sick=" + sick +
                '}';
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public AgeType getAgeType() {
        return ageType;
    }

    public void setAgeType(AgeType ageType) {
        this.ageType = ageType;
    }

    public RankWolf getRank() {
        return rank;
    }

    public void setRank(RankWolf rank) {
        this.rank = rank;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getImpetuous() {
        return impetuous;
    }

    public void setImpetuous(int impetuous) {
        this.impetuous = impetuous;
    }

    public WolfPack getHounds() {
        return hounds;
    }

    public void setHounds(WolfPack hounds) {
        this.hounds = hounds;
    }

    public double getFactorDomination() { return factorDomination; }

    public void setFactorDomination(double factorDomination) { this.factorDomination = factorDomination; }

    public boolean isFailFightVsAlphaMale() { return failFightVsAlphaMale; }

    public void setFailFightVsAlphaMale(boolean failFightVsAlphaMale)
    {
        this.failFightVsAlphaMale = failFightVsAlphaMale;
    }
}
