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
    private String properties = "";
    
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
            if(this.listAnimals.size() <= this.maxAnimals){
                this.listAnimals.add(animal);
                this.nbrAnimals++;
            }
            else{
                System.out.println("This enclosure is full");
            }
        }
        else
        {
            System.out.println("This enclosure of " + this.type + "s can't contain a " + animal.getName()); 
        }
    }
    
    public void removeAnimal(Animals animal)
    {
        if(this.listAnimals.contains(animal)){
            this.listAnimals.remove(animal);
            this.nbrAnimals--;
        } 
        else{
            System.out.println("This animal is not in this enclosure");        
        }
    }
    
    public void feedAnimal()
    {
        for(Animals animal: this.listAnimals){
            animal.eat();
        }
    }
    
    public String animalProperties()
    {
        
        for(Animals animal: this.listAnimals){
            
            properties = properties + animal.toString();
        }
        return properties;
    }
    
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
    
    //public Object cleanEnclosure(Animals animal)
    //{
    //    Enclosures clean = new Enclosures("bearEnclosure1", 50, 10,"Bear");
    //    return clean;
    //}
    
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