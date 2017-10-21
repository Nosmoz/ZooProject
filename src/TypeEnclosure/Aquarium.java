/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeEnclosure;

import TypeAnimals.Animals;
import TypeAnimals.AnimalsInterfaces.ISeaAnimals;
import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Aquarium<T extends Animals & ISeaAnimals> extends Enclosures<T>{
    
    private double depth;
    private int salinity;
    private int depthCleanliness;
    
    public Aquarium(String name, double area, int maxAnimals, String type, double depth) {
        super(name, area, maxAnimals, type);
        this.depth = depth;
        this.nbrAnimals = 0;
        this.cleanliness = 1;
        this.salinity = 1;
        this.depthCleanliness = 1;
        this.listAnimals = new ArrayList();
    }
    
    /**
     * Method to know if the enclosure is cleanable
     */
    public boolean isCleanable()
    {
        if(this.cleanliness > 1 & this.salinity > 1 & this.depthCleanliness > 1){
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

    /**
     * All of getters and setters for the class Enclosures
     */
    public double getDepth() {
        return depth;
    }

    public int getSalinity() {
        return salinity;
    }

    public int getDepthCleanliness() {
        return depthCleanliness;
    }
}
