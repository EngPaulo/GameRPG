/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.enemys;

import characters.Entities;
import objects.useless.BatWing;


public class Rat extends Enemy {
              
    

    public Rat() {
        this.name = "Rat";       
        this.experience = 2;
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
        
    }  
    
    
    

}
