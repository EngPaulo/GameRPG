/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author user
 */
public class Item {
    
    protected String description;
    protected double valor;
    
    protected double weight;
    
    protected int dropChance;
    
    
    
    public Item(){
        
    }
    
    public int getDropChance(){
        return  dropChance;
    }
    
    public void setDropChance(int dropChance){
        this.dropChance = dropChance;
    }
    
}
