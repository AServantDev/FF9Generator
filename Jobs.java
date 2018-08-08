import java.util.Hashtable;
import java.util.*;
import java.util.Enumeration;

/**
 * 
 */
public class Jobs {

	
	Stats stat1 = new Stats();
    /**
     * Default constructor
     */
    public Jobs() {
    }

    
    // déclarations des variables
    
    /**
     * 
     */
    public String type;

    /**
     * 
     */
    public String weapon;

    /**
     * 
     */
    public String armor;

    /**
     * 
     */
    public String wrist;
    
    //Getters and Setters

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getWrist() {
		return wrist;
	}

	public void setWrist(String wrist) {
		this.wrist = wrist;
	}

	public String getAddOn() {
		return addOn;
	}

	public void setAddOn(String addOn) {
		this.addOn = addOn;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
     * 
     */
    public String addOn;

    /**
     * 
     */
    public String skills;

    /**
     * 
     */
    
    //Méthodes
    
    //Méthodes pour créer un job
    
    public void createJob() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer le job de votre personnage (warrior, thief, dragoon, monk):");
    	String input= sc.next();
        type = input;
        setType(type);
        System.out.println("Le job de votre personnage est: " + getType());
        if (getType().equals("thief")) {
        	wrist = "light";
        	weapon = "Dagger, sword, double-sword and claws";
        	armor = "light";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que thief vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("dragoon")) {
        	wrist = "light, medium and heavy";
        	weapon = "spear and 2Handed-sword";
        	armor = "light, medium and heavy";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que dragoon vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("monk")) {
        	wrist = "light and medium";
        	weapon = "claws";
        	armor = "light and medium";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que monk vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("warrior")) {
        	wrist = "light, medium and heavy";
        	weapon = "sword, spear and 2Handed-sword";
        	armor = "light, medium and heavy";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que warrior vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }
          
    }

}