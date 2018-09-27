/*
 Contains the bases for all characters
 */
package characters;

import objects.armors.Armor;
import objects.wapons.Wapon;


/**
 *
 * @author user
 */
public class Entities {
       
    
    protected int hpBase = 5;
    protected int mpBase = 2;
            
    protected String name;    
    protected Integer experience;
    
    protected Double weigth;
    
    protected Integer strength;
    protected Integer constitution;
    protected Integer spirit;
    protected Integer intelligence;
    protected Integer agility;
    protected Integer dexterity;
    protected Integer lucky;
    
    protected Integer maxHP;
    protected Integer maxMP;
    protected Integer hp;
    protected Integer mp;
    
    protected Integer atackPower;
    protected Integer maxPhysicDamage;
    protected Integer minPhysicDamage;
    
    protected Integer magicPower;
    protected Integer maxMagicDamage;
    protected Integer minMagicDamage;
    
    protected Integer physicDefence;
    protected Integer magicDefence;
    
//    protected Integer atackSpeed;
    protected Integer precision;
    protected Integer evasion;
    
    protected Double critChance;  
// EQUIPAMENTS    
    protected Wapon wapon;
    protected Armor chest;
    
    public Entities(){
        
    }
    
    public String getName() {
        return name;
    }
    
    // Base stats

    public Integer getExperience() {
        return experience;
    }

    public Double getWeigth() {
        return weigth;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public Integer getSpirit() {
        return spirit;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getLucky() {
        return lucky;
    }
    
    //Secondary stats

    public Integer getMaxHP() {
        return maxHP;
    }
    
    public void setMaxHP(){
        maxHP = (int)(1.2 + (constitution * 10)) + (strength * 3) + hpBase;                
    }

    public Integer getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(){
        maxMP = (int)(1.2 + (spirit * 10)) + (intelligence * 2) + mpBase;                
    }
    
    public Integer getHp() {
        return hp;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getAtackPower() {        
        return atackPower;
    }

    public void setAtackPower(){
        if(wapon == null){
            atackPower = (strength * 4) + (constitution * 1);
        }
        else {
            atackPower = (strength * 4) + (constitution * 1) + wapon.getMaxDamage();
        }
        
    }
    
    public int getMaxPhysicDamage(){
        maxPhysicDamage = getAtackPower();
        return maxPhysicDamage;
    }
    
    public int getMinPhysicDamage(){
        int maxDamage = getMaxPhysicDamage();
        int minDamage = maxDamage/2;
        int range = maxDamage - minDamage;
        
        minPhysicDamage = minDamage + range * ( dexterity/100 );
        return minPhysicDamage;
    }
    
    public Integer getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(){
        magicPower = (intelligence * 4) + (spirit * 1);
    }
    
    public Integer getPhysicDefence() {
        return physicDefence;
    }

    public void setPhysicDefence(){
        if(chest == null){
            physicDefence = (constitution * 2) + (strength * 1);
        }
        else{
            physicDefence = (constitution * 2) + (strength * 1) + chest.getPhysicDefence();
        }
        
    }
    
    public Integer getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(){
        if(chest == null) {
            magicDefence = (spirit * 2) + (intelligence * 1);
        }
        else{
            magicDefence = (spirit * 2) + (intelligence * 1) + chest.getMagicDefence();
        }        
    }
    
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(){
        precision = (int)(dexterity * 2.5);        
    }        
    
    public Integer getEvasion() {
        return evasion;
    }

    public void setEvasion(){
        evasion = (int)(agility * 2.5);
    }
        
    public Double getCritChance() {
        return critChance;
    }
    
    public void setCritChance(){
        critChance = (lucky / 100.00);
    }
    
    // Método para calcular os status do personagem
    
    public void calcStats(){
        
        setMaxHP();
        setMaxMP();
        
        setAtackPower();
        setMagicPower();
        
        setPhysicDefence();
        setMagicDefence();
        
        setPrecision();
        setEvasion();
        setCritChance();
        
    }

    public void showStats(){
        System.out.println("");
        System.out.println( getName() + "'s stats:");
        System.out.println("---------------------");
        
        System.out.print("Streaght: ");
        System.out.println(this.strength);
        
        System.out.print("Constitution: ");
        System.out.println(this.constitution);        
        
        System.out.print("Spirit: ");
        System.out.println(this.spirit);        
        
        System.out.print("Intelligence: ");
        System.out.println(this.intelligence);        
        
        System.out.print("Agility: ");
        System.out.println(this.agility);        
        
        System.out.print("Dexterity: ");
        System.out.println(this.dexterity);       
        
        System.out.print("Lucky: ");
        System.out.println(this.lucky);         
        
        System.out.println("---------------------------------");       
      
        System.out.print("Max HP: ");
        System.out.println(this.maxHP);        
        
        System.out.print("Max MP: ");
        System.out.println(this.maxMP);

        System.out.print("HP: ");
        System.out.println(this.hp);        
        
        System.out.print("MP: ");
        System.out.println(this.mp);        
        
        System.out.print("Atack power: ");
        System.out.println(this.atackPower);     
        
        System.out.print("Max physic atack:");
        getMaxPhysicDamage();
        System.out.println(this.maxPhysicDamage);
        
        System.out.print("Min physic atack:");
        getMinPhysicDamage();
        System.out.println(this.minPhysicDamage);
        
        System.out.print("Magic Power: ");
        System.out.println(this.magicPower);        
        
        System.out.print("Physic defence: ");
        System.out.println(this.physicDefence);        
        
        System.out.print("Magic Defence: ");
        System.out.println(this.magicDefence);        
        
        System.out.print("Precision: ");
        System.out.println(this.precision);        
        
        System.out.print("Evasion: ");
        System.out.println(this.evasion);        
        
        System.out.print("Critical chance ");
        System.out.println((this.critChance * 100) + "%");  
        System.out.println("");
                
    }
       
    public void receiveDamage(int damage){
        this.hp -= damage;
        if (this.hp < 0){
            this.hp = 0;
        }
    }
    
    public void heal(int heal){
        hp += heal;
        if(hp > maxHP){
            hp = maxHP;
        }
    }
    
    public boolean isAlive(){
        return hp > 0;
    }
}
