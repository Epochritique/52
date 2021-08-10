import java.io.IOException;
import java.util.Scanner;

public class play52 {
	public static void main(String[] args) {
		String in = "";
		Scanner uIn = new Scanner(System.in);
		while(!in.equalsIgnoreCase("2")) {
			System.out.println("Welcome to 52!\n");	
		    System.out.println("What would you like to do?\n"
					+ "[1] Play\n"
					+ "[2] Quit");
		    in = uIn.nextLine();
			
		    switch(in) {
		    case "1":
		    	deck d = new deck();
		    	d.initDeck();
		    	boolean y=false;
		    	while(y!=true || d.deckD.size()>0) {
		    		String in2 = null;
		    		if(d.deckD.size()==deck.getDecksize()) {
		    			System.out.println("The deck is ready");
		    		    System.out.println("There are "+d.deckD.size()+" cards left in the deck.");
		    		    System.out.println("Press [Enter] to draw");
		    		}else {
		    		    System.out.println("There are "+d.deckD.size()+" cards left in the deck.");
		    		    System.out.println("Press [Enter] to draw");
		    		}
	    		    in2 = uIn.nextLine();
	    			y=d.draw();
	    			if(y==true) {
	    				break;
	    			}
		    	}
		    	System.out.println("Thanks for playing.");
		    	break;
		    case "2":
		    	System.out.println("Thanks for playing! Good bye!");
		    	break;
		    default:
		    	System.out.println("Unrecognized command!");
		    	break;
		    }
		}
		uIn.close();
	}
}
