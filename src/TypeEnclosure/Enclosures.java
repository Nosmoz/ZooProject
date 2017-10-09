package TypeEnclosure;

import TypeAnimals.Animals;
import java.util.ArrayList;

public class Enclosures {
    
    private String name;
    private double area;
    private final int maxAnimals;
    private int nbrAnimals;
    private Animals animal;
    private int cleanliness;
    private ArrayList<Animals> listAnimals;
    private String type;
    
    public Enclosures(String name, double area, int maxAnimals, String type) {
        
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.nbrAnimals = 0;
        this.cleanliness = 1;
        this.listAnimals = new ArrayList();
        this.type = type;
    }
    
    public void addAnimal(Animals animal)
    {
        if(this.type == animal.getName()){
        
            this.listAnimals.add(animal);
            this.nbrAnimals++;
        }
        else
        {
            System.out.println("Cette enclos ne reçois pas ce type d'animal"); 
        }
    }
    
    public void removeAnimal(Animals animal)
    {
        if(this.listAnimals.contains(animal)){
            this.listAnimals.remove(animal);
            this.nbrAnimals--;
        } 
        else{
            System.out.println("Cette animal n'est pas dans cette enclos");        
        }
    }
    
    public void feedAnimal()
    {
        for(Animals animal: this.listAnimals){
            animal.eat();
        }
    }
    
    public boolean isCleanable()
    {
        if(this.listAnimals.isEmpty() && this.cleanliness > 1){
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

    public String getType() {
        return type;
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

    public void setType(String type) {
        this.type = type;
    }
 
    
}