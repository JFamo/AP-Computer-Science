/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Ace","King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two"};
        String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
        int[] values = {1,13,12,11,10,9,8,7,6,5,4,3,2};
        Deck myDeck = new Deck(ranks, suits, values);
        myDeck.shuffle();
        System.out.println(myDeck.toString());
        myDeck.deal();  myDeck.deal();  myDeck.deal();
        System.out.println(myDeck.toString());
    }
}
