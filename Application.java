
import java.util.*;

/**
 * 
 */
public class Application {

    /**
     * Default constructor
     */
    public Application() {
    }

    /**
     * 
     */
    public static void main(String[] args) {
    	
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
    	
        
    	Character char1 = new Character();
    	
    	
    	char1.job.stat1.setLvl(1);
    	
    	Character char2 = new Character();
    	char2.setName("Zidane");
    	char2.job.setType("thief");
    	char2.job.stat1.setLvl(1);
    	
    	Character char3 = new Character();
    	char3.setName("Amarant");
    	char3.job.setType("monk");
    	char3.job.stat1.setLvl(1);
    	
    	char1.creerPerso();
    	char1.job.createJob();
    	char1.job.stat1.createStats(char1.job, char1);
    	
    	
    }

}