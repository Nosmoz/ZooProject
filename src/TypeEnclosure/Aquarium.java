/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeEnclosure;

/**
 *
 * @author Anthony
 */
public class Aquarium extends Enclosures{
    
    private double depth;
    private int salinity;
    
    public Aquarium(String name, double area, int maxAnimals, String type) {
        super(name, area, maxAnimals, type);
    }
    
}
