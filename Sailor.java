/**
 * This program simulates a drunken stagger on a board (plank) and
 * estimates the probability of falling.
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Jan. 20, 2023
 */
import java.util.Random;

public class Sailor {
    public static void main(String[] args) {  
        var rand = new Random(112);

	}


    public static int randStep(Random rand)  
    {  return (rand.nextInt(2) == 0 ? -1 : 1);  }  

}


