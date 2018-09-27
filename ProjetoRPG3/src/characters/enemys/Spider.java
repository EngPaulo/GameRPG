/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.enemys;

import characters.Entities;
import objects.Item;
import objects.armors.cap.CasualHat;
import objects.useless.BatWing;
import objects.useless.RatTail;


public class Spider extends Enemy {
                  

    public Spider() {
        this.name = "Spider";        
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
        
        int dropChance;        
        BatWing batWing = new BatWing(); 
        dropChance = 100;
        batWing.setDropChance(dropChance);                
        possibleLoot.add(batWing);
        
        CasualHat casualHat = new CasualHat();
        dropChance = 100;
        casualHat.setDropChance(dropChance);                
        possibleLoot.add(casualHat);
        
        RatTail ratTail = new RatTail();
        dropChance = 100;
        ratTail.setDropChance(dropChance);                
        possibleLoot.add(ratTail);
    }  
    
    
    

}
