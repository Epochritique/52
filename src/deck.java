import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class deck {
	private static final int deckSize = 52;
	
	List<card> deckD = new ArrayList<card>();

	public void initDeck(){
		deckD.clear();
		List<card> initD = new ArrayList<card>();
		for(int i=0; i<4; i++) {
			for(int j=1; j<=13; j++) {
				card c = null;
				String num = "";
				switch(j) {
				case 1:
					num="Ace";
					break;
				case 11:
					num="Jack";
					break;
				case 12:
					num="Queen";
					break;
				case 13:
					num="King";
					break;
				default:
					num+=j;
					break;
				}
				
				switch(i) {
				case 0:
					c = new card(num,"Diamond");
					break;
				case 1:
					c = new card(num,"Heart");
					break;
				case 2:
					c = new card(num,"Spade");
					break;
				case 3:
					c = new card(num,"Clove");
					break;	
				}
				initD.add(c);
			}
		}
        while (initD.size() > 0) {
            int index = (int) (Math.random() * initD.size());
            deckD.add(initD.remove(index));
        }
	}
	public boolean draw() {
		boolean Aspade=false;
		if(deckD.size()>0) {
			card c = deckD.get(deckD.size()-1);
			c.printCard();
			if(c.number.equalsIgnoreCase("Ace")&&c.suit.equalsIgnoreCase("Spade")) {
				Aspade=true;
				System.out.println("Hooray!");
			}
			deckD.remove(deckD.size()-1);
		}else {
			System.out.println("There is nothing to draw.");
		}
		return Aspade;
	}
	public List<card> getDeckD() {
		return deckD;
	}
	public void setDeckD(List<card> deckD) {
		this.deckD = deckD;
	}
	public static int getDecksize() {
		return deckSize;
	}
}
