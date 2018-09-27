/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.enemys;

import java.util.Set;
import objects.useless.BatWing;


public class Bat extends Enemy {
                          

    public Bat() {
        this.name = "Bat";        
        this.experience = 4;
        this.weigth = 1.00;   
        
        this.strength = 1;
        this.constitution = 1;
        this.spirit = 1;
        this.intelligence = 1;
        this.agility = 1;
        this.dexterity = 1;
        this.lucky = 1;     
        
        calcStats();        
        hp = maxHP;
        mp = maxMP;
        
        //    LOOT ITEMS
        int dropChance;        
        BatWing batWing = new BatWing(); 
        dropChance = 100;
        batWing.setDropChance(dropChance);                
        possibleLoot.add(batWing);
        
        
        //    LOOT GOLD
        maxGold = 5;
        minGold = 0;                                
    }  
    
    
    

}
