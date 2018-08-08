
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
     * @throws InterruptedException 
     * 
     */
    public static void main(String[] args) throws InterruptedException {
    	
    	
    	
        
    	Character char1 = new Character();
    	
    	
    	char1.job.stat1.setLvl(1);
    	
    	
    	
    	char1.creerPerso();
    	
    	char1.job.createJob();
    	char1.job.stat1.createStats(char1.job, char1);
    	
    	
    }

}