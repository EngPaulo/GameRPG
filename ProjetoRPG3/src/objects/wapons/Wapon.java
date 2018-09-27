/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.wapons;
import java.util.Random;
import objects.Item;

/**
 *
 * @author user
 */
public class Wapon extends Item {
    
    protected int maxDamage;
    protected int minDamage;      
    
    public Wapon(){
        
    }
    
    public int getMaxDamage(){
        return maxDamage;
    }
    
    public int getMinDamage(){
        return minDamage;
    }
    
    public int damage(){
        Random ram = new Random();
        int damage = ram.nextInt(maxDamage - minDamage);
        return damage;
        
    }
        
}
