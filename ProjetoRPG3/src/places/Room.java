/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package places;


import characters.Entities;
import characters.enemys.Bat;
import characters.enemys.Rat;
import characters.enemys.Spider;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import objects.Item;

/**
 *
 * @author user
 */
public class Room {
    
    private List<Entities> enemys = new ArrayList();  
    private List<Item> items = new ArrayList();
    
    //private final List<Character> itens = new ArrayList();

    public Room() {
        
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public List<Item> getItems(){
        return items;
    }
    
    public void addEnemy(Entities enemy){
        enemys.add(enemy);
        
    }

    public void removeEnemy(Entities enemy){
        enemys.remove(enemy);
    }
            
    public List<Entities> getEnemys(){
        return enemys;
    }          
    
    public void enemysInRoom(){
        
        Random r = new Random();
        int n = r.nextInt(4);
        
               
        System.out.println("You found in this room " + n + " enemys!");
        for(int i = 0, enemyType ; i < n; i++){
             enemyType = r.nextInt(3) + 1;
            
            
            switch(enemyType){
                case 1:
                    Bat bat = new Bat();
                    enemys.add(bat);
                    break;
                case 2:
                    Rat rat = new Rat();
                    enemys.add(rat);
                    break;
                case 3:
                    Spider spider = new Spider();
                    enemys.add(spider);
                    break;
            }         
         }
        for (Entities e: enemys){
             System.out.println(e.getName());
        }
    }
    
    public int numberOfEnemys(){
        int i = 0;
        for(Entities e: enemys){
            i++;
        }
        return i;
    }
    
    public boolean thereAreEnemysInRoom(){
        return numberOfEnemys() > 0;        
    }
            
}
