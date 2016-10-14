import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Titanic {

	public static void main(String[] args) throws IOException {
		int passengerCount = 0, survivorCount = 0, men = 0, women = 0, children = 0, w;
		boolean x,z;
		String y;
		PassengerData titanic = new PassengerData();
		File f = new File("titanic.txt");
		Scanner scan = new Scanner (f);
	      try {
	    	  while (scan.hasNext()) {
	    		  w = scan.nextInt();
	    		  x = scan.nextBoolean();
	    		  y = scan.next();
	    		  z = scan.nextBoolean();
	    		  titanic.addPassenger(w, x, y, z);
	    		  passengerCount++;
	    		  if(z)
	    			  survivorCount++;
	    		  if(x)
	    			  children++;
	    		  if(y.equals("male"))
	    			  men++;
	    		  else
	    			  women++;	  
	    	  }	
	      } finally { scan.close();  }
	    System.out.println(passengerCount + " People were on the Titanic");
	    System.out.println(survivorCount + " People survived the Titanic");
	    System.out.println("The survival rate was: " + (100*survivorCount / passengerCount) + "%");
	    System.out.println("There was " + men + " men, " + women + " women, and " + children + " children");
	}

}
