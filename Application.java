
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
        
    	Character char1 = new Character();
    	char1.setName("Freyja");
    	char1.job.setType("dragoon");
    	char1.job.stat1.setLvl(1);
    	
    	Character char2 = new Character();
    	char2.setName("Zidane");
    	char2.job.setType("thief");
    	char2.job.stat1.setLvl(1);
    	
    	Character char3 = new Character();
    	char3.setName("Amarant");
    	char3.job.setType("monk");
    	char3.job.stat1.setLvl(1);
    	
    	char1.job.stat1.createStats(char1.job, char1);
    	System.out.println(" ");
    	char2.job.stat1.createStats(char2.job, char2);
    	System.out.println(" ");
    	char3.job.stat1.createStats(char3.job, char3);
    	
    }

}