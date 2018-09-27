/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.enemys;

import characters.Entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import objects.Item;

/**
 *
 * @author user
 */
public class Enemy extends Entities{
    
    List<Item> possibleLoot = new ArrayList();
    int maxGold;
    int minGold;
    int goldChance;
    
    public Enemy(){
        
    }
    
    public List<Item> ItemLoot() {    

    return possibleLoot;
}
    
    public boolean itemDrop (Item item){
        Random roll = new Random();
        int chance = item.getDropChance(); 
        
        return chance >= roll.nextInt(101);        
    }
    
    public int goldLoot(){
        Random ran = new Random();
        if(ran.nextInt(101) >= goldChance){
            int diference = maxGold - minGold;
            int gold = diference + minGold;
            return gold;
        }
        else{
            return 0;
        }                        
    }
    
}
