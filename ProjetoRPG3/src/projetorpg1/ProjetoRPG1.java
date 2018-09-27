package projetorpg1;



import actions.Combat;
import characters.Entities;
import characters.players.Player;
import places.Room;


public class ProjetoRPG1 {

    public static void main(String[] args) {
        // TODO code application logic here        
        Player player = new Player("Player");        
        player.showStats();
        Room room = new Room();
                
        room.enemysInRoom();
        
        /*for(Entities e : room.getEnemys()){
            e.calcStats();
            e.showStats();
        }*/
        
        if(room.thereAreEnemysInRoom()){
            Combat combat = new Combat(room, player);
            combat.startCombat();
            
            
        }
        
        
        
        
        
        
        
        
        }
        
    }
    
