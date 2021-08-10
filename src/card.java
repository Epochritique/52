
public class card {
	String number;
	String suit;
	
	public card(String number, String suit) {
		super();
		this.number = number;
		this.suit = suit;
	}
	
	public void printCard() {
		System.out.println("You drew the "+this.number + " of " + this.suit + "s!\n");
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
}
