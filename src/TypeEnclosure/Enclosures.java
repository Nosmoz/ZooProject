package TypeEnclosure;

import TypeAnimals.Animals;
import java.util.ArrayList;

/**
 * This class modelize the class Enclosures
 * @author Anthony Cargnino
 */
public class Enclosures<T extends Animals> {
    
    protected String name;
    protected double area;
    protected final int maxAnimals;
    protected int nbrAnimals;
    //protected Animals animal;
    protected int cleanliness;
    protected ArrayList<T> listAnimals;
    protected String type;
    protected String properties = "";
    
    /**
     * Constructor for the class Enclosures
     * @param name
     * @param area
     * @param maxAnimals
     * @param nbrAnimals
     * @param animal
     * @param cleanliness
     * @param listAnimals
     * @param type
     */
    public Enclosures(String name, double area, int maxAnimals, String type) {
        
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.nbrAnimals = 0;
        this.cleanliness = 1;
        this.listAnimals = new ArrayList();
        this.type = type;
        
    }
    
    /**
     * Method to add an animal in the enclosure
     */
    public void addAnimal(T animal)
    {

        if(this.listAnimals.size() <= this.maxAnimals){
                this.listAnimals.add(animal);
                this.nbrAnimals++;
            }
        else{
                System.out.println("This enclosure is full");
            }
    }
    
    
    /**
     * Method to remove an animal in the enclosure
     */
    public void removeAnimal(T animal)
    {
        if(this.listAnimals.contains(animal)){
            this.listAnimals.remove(animal);
            this.nbrAnimals--;
        } 
        else{
            System.out.println("This animal is not in this enclosure");        
        }
    }
    
    /**
     * Method to feed all animals in the enclosure
     */
    public void feedAnimal()
    {
        for(Animals animal: this.listAnimals){
            animal.eat();
        }
    }
    
    /**
     * Method to show every properties of all animals in the enclosure
     */
    public String animalProperties()
    {
        
        for(Animals animal: this.listAnimals){
            
            properties = properties + animal.toString();
        }
        return properties;
    }
    
    /**
     * Method to know if the enclosure is cleanable
     */
    public boolean isCleanable()
    {
        if(this.cleanliness > 1){
            if(this.listAnimals.isEmpty()){
                return true;
            }
            else{
                System.out.println("The enclosure is not empty");
                return false;
            }    
        }
        else
        {
            System.out.println("The enclosure is not dirty");
            return false;
        }
    }
    
    public void dirty()
    {
        if(this.cleanliness < 3)
        {
            this.cleanliness = this.cleanliness + 1;
        }
        else{
            System.out.println("This enclosure is very dirty");
        }
    }
    
    /**
     * All of getters and setters for the class Enclosures
     */
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

    /*public Animals getAnimal() {
        return animal;
    }*/

    public int getCleanliness() {
        return cleanliness;
    }

    public String getType() {
        return type;
    }

    public ArrayList<T> getListAnimals() {
        return listAnimals;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    /*public void setAnimal(Animals animal) {
        this.animal = animal;
    }*/

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public void setType(String type) {
        this.type = type;
    }
 
    /**
     *
     * @return all enclosures elements on string type
     */
    @Override
    public String toString() {
            return "Enclosure{" +
                    "name='" + this.name + '\'' +
                    ", area=" + this.area +
                    ", maximum contents=" + this.maxAnimals +
                    ", type=" + this.type +
                    ", level of cleanliness=" + this.cleanliness + 
                    ", number=" + this.nbrAnimals +
                    '}';
        }
}