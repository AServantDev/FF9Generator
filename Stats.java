
import java.util.*;

/**
 * 
 */
public class Stats {

    /**
     * Default constructor
     */
    public Stats() {
    }

    /**
     * 
     */
    public int speed;

    /**
     * 
     */
    public int strength;

    /**
     * 
     */
    public int magic;

    /**
     * 
     */
    public int spirit;

    /**
     * 
     */
    public int attack;

    /**
     * 
     */
    public int defense;

    /**
     * 
     */
    public int evade;

    /**
     * 
     */
    public int magicDef;

    /**
     * 
     */
    public int magicEvade;

    /**
     * 
     */
    public int lvl;

    /**
     * 
     */
    public int hp;

    /**
     * 
     */
    public int mp;

    /**
     * 
     */
   

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getSpirit() {
		return spirit;
	}

	public void setSpirit(int spirit) {
		this.spirit = spirit;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getEvade() {
		return evade;
	}

	public void setEvade(int evade) {
		this.evade = evade;
	}

	public int getMagicDef() {
		return magicDef;
	}

	public void setMagicDef(int magicDef) {
		this.magicDef = magicDef;
	}

	public int getMagicEvade() {
		return magicEvade;
	}

	public void setMagicEvade(int magicEvade) {
		this.magicEvade = magicEvade;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	 public void createStats(Jobs job, Character charac) {
	    	
	    	if(charac.job.getType().equals("thief")) {
	    		speed = (int) (Math.random() * (18 - 8) + 8);
	    		strength = (int) (Math.random() * (13 - 6) + 6);
	    		magic = (int) (Math.random() * (10 - 5) + 5);
	    		spirit = (int) (Math.random() * (13 - 6) +6);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    	   	
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" "  + charac.getName() + " sont :\nspeed: " 
	    		+ charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    		+ charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("dragoon")) {
	    		speed = (int) (Math.random() * (13 - 6) + 6);
	    		strength = (int) (Math.random() * (15 - 8)+ 8);
	    		magic = (int) (Math.random() * (10 - 5)+ 5);
	    		spirit = (int) (Math.random() * (13 - 6)+6);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if (job.getType().equals("monk")) {
	    		speed = (int) (Math.random() * (15 - 8) +8);
	    		strength = (int) (Math.random() * (15 - 8)+8);
	    		magic = (int) (Math.random() * (8 - 5)+5);
	    		spirit = (int) (Math.random() * (13 - 6)+6);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if (job.getType().equals("warrior")) {
	    		speed = (int) (Math.random() * (8 - 5) +5);
	    		strength = (int) (Math.random() * (18 - 8)+8);
	    		magic = (int) (Math.random() * (8 - 5)+5);
	    		spirit = (int) (Math.random() * (10 - 5)+5);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    	}else if(job.getType().equals("paladin")) {
	    		speed = (int) (Math.random() * (8 - 5) + 5);
	    		strength = (int) (Math.random() * (18 - 8)+ 8);
	    		magic = (int) (Math.random() * (9 - 5)+ 5);
	    		spirit = (int) (Math.random() * (13 - 6)+6);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("white mage")) {
	    		speed = (int) (Math.random() * (10 - 7) + 7);
	    		strength = (int) (Math.random() * (7 - 5)+ 5);
	    		magic = (int) (Math.random() * (10 - 5)+ 5);
	    		spirit = (int) (Math.random() * (18 - 10)+10);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("red mage")) {
	    		speed = (int) (Math.random() * (10 - 6) + 6);
	    		strength = (int) (Math.random() * (12 - 7)+ 7);
	    		magic = (int) (Math.random() * (12 - 7)+ 7);
	    		spirit = (int) (Math.random() * (12 - 7)+ 7);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("black mage")) {
	    		speed = (int) (Math.random() * (10 - 6) + 6);
	    		strength = (int) (Math.random() * (7 - 5)+ 5);
	    		magic = (int) (Math.random() * (18 - 10)+ 10);
	    		spirit = (int) (Math.random() * (10 - 7)+ 7);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("blue mage")) {
	    		speed = (int) (Math.random() * (10 - 6) + 6);
	    		strength = (int) (Math.random() * (10 - 6)+ 6);
	    		magic = (int) (Math.random() * (15 - 8)+ 8);
	    		spirit = (int) (Math.random() * (12 - 7)+ 7);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}else if(job.getType().equals("invokeur")) {
	    		speed = (int) (Math.random() * (12 - 6) + 6);
	    		strength = (int) (Math.random() * (7 - 5)+ 5);
	    		magic = (int) (Math.random() * (15 - 8)+ 8);
	    		spirit = (int) (Math.random() * (15 - 8)+ 8);
	    		evade = (charac.job.stat1.getSpeed() * charac.job.stat1.getLvl());
	    		
	    		System.out.println("Les statistiques du "+ charac.job.getType()+" " + charac.getName() + " sont :\nspeed: " 
	    	    + charac.job.stat1.getSpeed() +"\nstrength: " + charac.job.stat1.getStrength() + "\nmagic: " + charac.job.stat1.getMagic() + "\nspirit: " + charac.job.stat1.getSpirit() + "\nevade: " 
	    	    + charac.job.stat1.getEvade());
	    		
	    	}
	    	
	    }

}