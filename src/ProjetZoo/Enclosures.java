package ProjetZoo;


public class Enclosures {
    
    private String name;
    private double area;
    private final int maxAnimals;
    private int nbrAnimals;
    private Animals animal;
    private int cleanliness;
    private Animals[] arrayAnimals;
    
    public Enclosures(String name, double area, int maxAnimals) {
        
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.nbrAnimals = 0;
        this.cleanliness = 1;
	this.arrayAnimals = new Animals[maxAnimals];
    }
    
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

    public String toString() {
	return "";
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

    //setter des attribut de la classe
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
