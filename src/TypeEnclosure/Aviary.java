/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeEnclosure;

import TypeAnimals.Animals;
import TypeAnimals.AnimalsInterfaces.IFlyingAnimals;
import java.util.ArrayList;


/**
 * This class modelize the class Enclosures
 * @author Anthony Cargnino
 */
public class Aviary<T extends Animals & IFlyingAnimals> extends Enclosures<T> {
    
    private double height;
    private int roofCleanliness;
    
        /**
     * Constructor for the class Aviary
     * @param height
     * @param roofCleanliness
     */
    public Aviary(String name, double area, int maxAnimals, String type, double height) {
        super(name, area, maxAnimals, type);
        this.nbrAnimals = 0;
        this.cleanliness = 1;
        this.listAnimals = new ArrayList();
        this.height = height;
        this.roofCleanliness = 1;
    }
    
    /**
     * Method to know if the enclosure is cleanable
     */
    public boolean isCleanable()
    {
        if(this.cleanliness > 1 & this.roofCleanliness > 1){
            if(this.listAnimals.isEmpty()){
                System.out.println("The enclosure is cleanable");
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
    public double getHeight() {
        return height;
    }

    public int getRoofCleanliness() {
        return roofCleanliness;
    }
}
