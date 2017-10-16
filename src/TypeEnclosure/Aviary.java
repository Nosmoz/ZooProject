/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeEnclosure;

import java.util.ArrayList;


/**
 * This class modelize the class Enclosures
 * @author Anthony Cargnino
 */
public class Aviary extends Enclosures {
    
    private double height;
    private int roofCleanliness;
    
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
     * @param height
     * @param roofCleanliness
     */
    public Aviary(String name, double area, int maxAnimals, String type) {
        super(name, area, maxAnimals, type);
        this.nbrAnimals = 0;
        this.cleanliness = 1;
        this.listAnimals = new ArrayList();
    }
    
    /**
     * Method to know if the enclosure is cleanable
     */
    public boolean isCleanable()
    {
        if(this.cleanliness > 1 & this.roofCleanliness > 1){
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
    public double getHeight() {
        return height;
    }

    public int getRoofCleanliness() {
        return roofCleanliness;
    }
}
