/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.armors;

import objects.Item;

/**
 *
 * @author user
 */
public class Armor extends Item{
    
    protected int physicDefence;
    protected int magicDefence;
    
    public Armor(){
        
    }
    
    public int getPhysicDefence(){
        return physicDefence;
    }
    
    public int getMagicDefence(){
        return magicDefence;
    }
    
    
}


