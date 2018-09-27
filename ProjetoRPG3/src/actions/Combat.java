/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import characters.Entities;
import characters.enemys.Enemy;
import characters.players.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import objects.Item;
import places.Room;

/**
 *
 * @author user
 */
public class Combat {
    
    private List<Entities> enemys = new ArrayList();
    private Player player;
    private Room room;
    
    public Combat(Room room, Player player){        
        this.player = player;
        
        this.room = room;
        enemys = this.room.getEnemys();
        for(Entities e: enemys){
            e.calcStats();
        }        
                
    }
    
    public Entities getSingleEnemy(int i){        
        return enemys.get(i); 
        
    }
    
    public int numberOfEnemys(){
        int i = 0;
        for(Entities e: enemys){
            i++;
        }
        return i;
    }

    public void startCombat(){
        Scanner sc = new Scanner(System.in);
        int target;
        while(numberOfEnemys() > 0){
            target = 0;            
            System.out.println("Which enemy will you atack?");
            for(Entities e : enemys){                
                System.out.println((target + 1) + " - " + e.getName());
                target++;
            }
            target = sc.nextInt() - 1;            
            sc.nextLine();                                                            
            atack(player, getSingleEnemy(target) );
            
            for(Entities e : enemys){
                atack(e, player);
            }
                       
                
        }
        
       
        
    }
    
    
    public void atack(Entities atacker, Entities defender){
        
        System.out.println("Atack start!");   
        Random r = new Random();
        
        int minDamage = atacker.getMinPhysicDamage();
        int maxDamage = atacker.getMaxPhysicDamage();
                                
        int damage = r.nextInt(maxDamage - minDamage);
        
        if (damage <= 0){
            damage = 1;            
        }
        
        defender.receiveDamage(damage);
        
        //TEXT        
        System.out.println(atacker.getName() + " is atacking " + defender.getName() + "!");
        System.out.println( defender.getName() + " receive " + damage + " points of damage!");
        
        System.out.println(defender.getName() + " has now " + defender.getHp() + " hit points.");
        System.out.println("");
        
        if(!defender.isAlive()){                            //Verifica se o defensor está morto (FALTA ROTINA PARA PLAYER MORTO)
            if(defender instanceof Enemy) {                 //Verrifica se o defensor é um inimigo
                
                Enemy deadDefender = (Enemy)defender;       //Converte a entidade defensor em um inimigo
                System.out.println("LOOOOT");
                List<Item> loot = new ArrayList();          //Cria uma lista para os itens de loot
                loot = deadDefender.ItemLoot();             //Executa a rotina para verificar quais itens serão loot
                for(Item i : loot){                         //Para cada item do loot 
                    
                    if(deadDefender.itemDrop(i)){           //Verifica se o item vai cair                   
                        room.addItem(i);                    //Se cair adicona na lista
                        System.out.println(i);
                    }
                }
            enemys.remove(defender);       //remove o defensor da lista de inimigos na sala
            room.removeEnemy(defender);    //remove o defensor da lista de inimigos da luta
            
                System.out.println("");
                System.out.println("Items na sala");
            for(Item i : room.getItems() )
                    System.out.println(i);
                                
            }
            
        }
        
    }
    
    
}
