package TypeEnclosure;

import TypeAnimals.Animals;


public class Enclosures {
    
    private String name;
    private double area;
    private final int maxAnimals;
    private int nbrAnimals;
    private Animals animal;
    private int cleanliness;
    private Animals[] arrayAnimals;
    private int counter;
    
    public Enclosures(String name, double area, int maxAnimals) {
        
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.nbrAnimals = 0;
        this.cleanliness = 1;
	this.arrayAnimals = new Animals[maxAnimals];
        //this.counter = 0;
    }
    
    public void addAnimal(Animals animal)
    {
        //arrayAnimals[counter] = animal;
        //counter++;
    }
    
    public void removeAnimal(Animals animal)
    {
        
        //counter--;
    }
    
    public void feedAnimal(Animals animal)
    {
        animal.eat();
    }
    
    public boolean isCleanable()
    {
        if(this.arrayAnimals.equals(0) && this.cleanliness > 1){
            this.cleanliness = 1;
            return true;
        }
        else
        {
            System.out.println("L'enclos ne peut pas être nettoyé");
            return false;
        }
    }

    public String toString() {
	return "("+")";
    }
        
    //getter des attribut de la classe
    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public Animals getAnimal() {
        return animal;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getCounter() {
        return counter;
    }

    //setter des attribut de la classe
    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void setAnimal(Animals animal) {
        this.animal = animal;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}
