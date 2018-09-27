/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.players;

import characters.Entities;
import java.util.Scanner;

public class Player extends Entities {
    
    Integer level;
    int gold;
              
    Scanner sc = new Scanner(System.in);
    

    public Player(String name) {
                
        this.name = name;
        
        hpBase = 20;
        mpBase = 5;
        
        level = 1;
        gold = 0;
        experience = 0;
        weigth = 75.00;   
        
        strength = 3;
        constitution = 3;
        spirit = 3;
        intelligence = 3;
        agility = 3;
        dexterity = 3;
        lucky = 3; 
        
        calcStats();        
        hp = maxHP;
        mp = maxMP;
        
        
    }          

}
