import java.util.Scanner;
import java.util.*;

/**
 * 
 */
public class Character {
	
	Jobs job = new Jobs();
	

    /**
     * Default constructor
     */
    public Character() {
    }

    /**
     * 
     */
    public String name;

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
	
    public void creerPerso() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer le nom de votre personnage :");
    	String input= sc.next();
        name = input;
        setName(name);
        System.out.println("Entrer sa ville de naissance: ");
        String input2 = sc.next();
        hometown = input2;
        setHometown(hometown);
        System.out.println("Entrer son age: ");
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
        	money = (int) (Math.random() * ((1000 - 600)+600) );
        	setMoney(money);
        }
        System.out.println(getName()+ " est né(é) à " + getHometown() + " en " + (1000 - getAge()) + ".\nIl appartient au rang social des "
        + getSocialRank() + " et possède " + getMoney()+ " gils.");
       
        
    }

}