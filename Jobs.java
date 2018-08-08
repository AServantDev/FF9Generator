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
    
    Enumeration names;
	int key;
    
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
     * @throws InterruptedException 
     * 
     */
    
    //Méthodes
    
    //Méthodes pour créer un job
    
    public void createJob() throws InterruptedException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer le job de votre personnage:");
    	
    	Hashtable <Integer, String> jobs = new Hashtable <Integer,String>();
    	jobs.put(1, "warrior");
    	jobs.put(2, "thief");
    	jobs.put(3, "dragoon");
    	jobs.put(4, "monk");
    	jobs.put(5, "paladin");
    	jobs.put(6, "white mage");
    	jobs.put(7, "red mage");
    	jobs.put(8, "black mage");
    	jobs.put(9, "blue mage");
    	jobs.put(10, "invokeur");
    	
    	names = jobs.keys();
    	while(names.hasMoreElements()) {
    	      key = (int) names.nextElement();
    	      System.out.println(key+ " - Job: " +
    	      jobs.get(key));
    	   }
    	
    	int input= sc.nextInt();
        type = jobs.get(input);
        setType(type);
        
        System.out.println("Le job de votre personnage est: " + getType());
        Thread.sleep(2000);
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
        }else if (getType().equals("blue mage")) {
        	wrist = "light";
        	weapon = "dagger, fork";
        	armor = "light";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que blue mage vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("white mage")) {
        	wrist = "light";
        	weapon = "scepter, dagger";
        	armor = "light";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que white mage vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("black mage")) {
        	wrist = "light";
        	weapon = "staff, dagger";
        	armor = "light, medium and heavy";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que black mage vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("red mage")) {
        	wrist = "light";
        	weapon = "sword, staff, scepter";
        	armor = "light";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que red mage vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("paladin")) {
        	wrist = "light, medium and heavy";
        	weapon = "sword, 2Handed-sword and scepter";
        	armor = "light, medium and heavy";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que paladin vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }else if (getType().equals("invokeur")) {
        	wrist = "light";
        	weapon = "scepter and instrument";
        	armor = "light";
        	setWeapon(weapon);
        	setArmor(armor);
        	setWrist(wrist);
        	System.out.println("En tant que invokeur vos équipement disponible sont:\nweapon: " + getWeapon() + "\nwrist: " + wrist
        	+ "\narmor: " + armor) ;
        }
          
    }

}