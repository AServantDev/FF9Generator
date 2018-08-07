
import java.util.*;

/**
 * 
 */
public class Character {
	
	Jobs job = new Jobs();
	Jobs job2 = new Jobs();

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
        // TODO implement here
    }

}