/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Jack","Hearts",8);
		Card c2 = new Card("Jack","Hearts",8);
		Card c3 = new Card("Jack","Spades",8);
		System.out.println(c1.matches(c2));
	}
}
