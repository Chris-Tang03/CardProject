/**
 * Created by Cwolf on 3/21/17.
 */
public class Card {
    private String rank;
    private String suit;
    boolean faceUp;

    public Card(Suit spades, Rank king, boolean faceUp) {
        this.faceUp = faceUp;

    }

    public Card(Rank rank, boolean faceUp) {
    }

    public Card(String suit, Rank rank, boolean faceUp) {
    }

    public boolean flip() {
        this.faceUp = !this.faceUp;
        return this.faceUp;

    }

    public String getRank() {
        return rank;
    }
}
