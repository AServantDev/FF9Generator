import java.util.*;

/**
 * 
 */
public class Character {
	
	Jobs job = new Jobs();
	
	Enumeration names;
	int key;
	

    /**
     * Default constructor
     */
    public Character() {
    }

    /**
     * 
     */
    public String name;
    
    public String race;

    public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	/**
     * 
     */
    public String hometown;

    /**
     * 
     */
    public String distinctiveSign;
    
	/**
     * 
     */
    public int age;

    /**
     * 
     */
    public int money;

    /**
     * 
     */
    public String socialRank;

    /**
     * 
     */
    
    //Getters and Setters

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getDistinctiveSign() {
		return distinctiveSign;
	}

	public void setDistinctiveSign(String distinctiveSign) {
		this.distinctiveSign = distinctiveSign;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getSocialRank() {
		return socialRank;
	}

	public void setSocialRank(String socialRank) {
		this.socialRank = socialRank;
	}
	
	//Méthodes
	
    public void creerPerso() throws InterruptedException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer le nom de votre personnage :");
    	String input= sc.next();
        name = input;
        setName(name);
        
        job.race.createRace();
        /*System.out.println("Entrer la race de votre personnage :");
        
        Hashtable <Integer, String> races = new Hashtable <Integer,String>();
    	races.put(1, "genom");
    	races.put(2, "human");
    	races.put(3, "rat");
    	races.put(4, "kwe");
    	races.put(5, "invokeur");
    	races.put(6, "black mage");
    	
    	names = races.keys();
    	while(names.hasMoreElements()) {
    	      key = (int) names.nextElement();
    	      System.out.println(key+ " - Race: " +
    	      races.get(key));
    	   }
    	
    	int input5 = sc.nextInt();
        race = races.get(input5);
        
        setRace(race);*/
    	
        System.out.println("Entrer sa ville de naissance: ");

		Hashtable <Integer, String> cities = new Hashtable <Integer,String>();
    	cities.put(1, "Lindblum");
    	cities.put(2, "Tréno");
    	cities.put(3, "Alexandria");
    	cities.put(4, "Burmecia");
    	cities.put(5, "Daguerro");
    	cities.put(6, "Zerin");
    	cities.put(7, "Celes");
    	cities.put(8, "Dali");
    	cities.put(9, "Madahine-Salee");
    	cities.put(10, "Gaza Est");
    	
    	names = cities.keys();
    	while(names.hasMoreElements()) {
    	      key = (int) names.nextElement();
    	      System.out.println(key+ " - Ville: " +
    	      cities.get(key));
    	   }
    	
        int input2 = sc.nextInt();
        hometown = cities.get(input2);
        
        setHometown(hometown);
        
        System.out.println("Entrer son age (chiffre entier): ");
        int input3 = sc.nextInt();
        age = input3;
        setAge(input3);
        System.out.println("Entrer son rang social:\n1- Pauvre\n2- Citoyen\n3- Aisé\n4- Riche");
        int input4 = sc.nextInt();
        
        if(input4 == 1) {
        	socialRank = "Pauvre";
        	setSocialRank(socialRank);
        	money = (int) (Math.random() * (200 - 0)+0);
        	setMoney(money);
        }else if (input4 == 2) {
        	socialRank = "Citoyen";
        	setSocialRank(socialRank);
        	money = (int) (Math.random() * (500 - 300)+300);
        	setMoney(money);
        }else if (input4 == 3) {
        	socialRank = "Aisé";
        	setSocialRank(socialRank);
        	money = (int) (Math.random() * (800 - 500)+500 );
        	setMoney(money);
        }else if (input4 == 4) {
        	socialRank = "Riche";
        	setSocialRank(socialRank);
        	money = (int) (Math.random() * (1000 - 600) +600 );
        	setMoney(money);
        }
        System.out.println("");
        System.out.println(getName()+ " le " +job.race.getType()+ " est né à " + getHometown() + " en " + (1000 - getAge()) + ".\nIl appartient au rang social des "
        + getSocialRank() + " et possède " + getMoney()+ " gils.");
        Thread.sleep(2000);
       
        
    }

}