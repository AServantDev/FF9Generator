
import java.util.*;

/**
 * 
 */
public class Races {

    /**
     * Default constructor
     */
    public Races() {
    }
    
    Enumeration names;
	int key;

    /**
     * 
     */
    public String type;

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getWeightCategory() {
		return weightCategory;
	}

	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}

	/**
     * 
     */
    public int lifeExpectancy;

    /**
     * 
     */
    public String weightCategory;

    /**
     * 
     */
    public void createRace() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer la race de votre personnage :");
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
    	
    	int input = sc.nextInt();
       type = races.get(input);
       setType(type);
    }

}