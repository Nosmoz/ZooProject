package ProjetZoo;

public class Enclosures {
    
    private String name;
    private double area;
    private int maxAnimals;
    private int nbrAnimals;
    private Animals animal;
    private int cleanliness;
    
    
    public void addAnimal()
    {

    }
    
    public void removeAnimal()
    {

    }
    
    public void feedAnimal()
    {
    
    }
    
    public boolean isCleanable()
    {
        //if(){
        
        //}
        //else
        //{
        //    System.out.println("L'enclos n'est pas vide");
        //}
        return false;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setMaxAnimals(int maxAnimals) {
        this.maxAnimals = maxAnimals;
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
}
