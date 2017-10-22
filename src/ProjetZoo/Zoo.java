package ProjetZoo;

import TypeEnclosure.Enclosures;
import java.util.ArrayList;

public class Zoo {
    
    private String name;
    private ArrayList<Enclosures> listEnclosure;
    private int maxEnclosure;
    private Employer employer;
    private Enclosures enclosure;
    private boolean workEmployee;
    private int nbrEnclosure;
    
    public Zoo(String name, Employer employer, int maxEnclosure)
    {
        this.name = name;
        this.employer = employer;
        this.maxEnclosure = maxEnclosure;
        this.listEnclosure = new ArrayList();
        this.workEmployee = false;
    }
    
    public int totalAnimal()
    {
        int total = 0;
        for(Enclosures enclosure: this.listEnclosure){
            
            total = total + enclosure.getNbrAnimals();
            
        }
        return total;
    }
    
    public void allAnimal()
    {
        for(Enclosures enclosure: this.listEnclosure){
            
            System.out.println(enclosure.animalProperties());
        }
    }

    public void allEnclosure()
    {
        for (Enclosures enclosure: this.listEnclosure)
        {
            System.out.print(enclosure.getName());
        }
    }
    
    public void addEnclosure(Enclosures enclosure)
    {
        if(this.listEnclosure.size() <= this.maxEnclosure){
            this.listEnclosure.add(enclosure);
            this.nbrEnclosure++;
            System.out.println(enclosure.getName() +" is now in "+this.name);
        }
        else{
            System.out.println("The zoo is full");
        }
    }
    
    public void removeEnclosure(Enclosures enclosure)
    {
        if(this.listEnclosure.contains(enclosure)){
            if(enclosure.getNbrAnimals() == 0)
            {
                this.listEnclosure.remove(enclosure);
                this.nbrEnclosure--;
                System.out.println("This enclosure is remove");
            }
            else
            {
                System.out.println("This enclosure is not empty");
            }
            
        } 
        else{
            System.out.println("This enclosure is not in the zoo");        
        }
    }
    
    public void randomStateAnimal()
    {
        //int tableauIndex = (int) (Math.random() * (this.nbrEnclosure - 1));
        //int animalIndex = (int) (Math.random()* (this.listEnclosure.get(0).getNbrAnimals() - 1));
        //this.listEnclosure.get(tableauIndex).getListAnimals().get(animalIndex).setHungry(1);   
    }
    
    public void randomStateEnclosure()
    {
        int tableauIndex = (int) (Math.random() * (this.nbrEnclosure - 1));
        
        this.listEnclosure.get(tableauIndex).dirty();
    }
    
}
