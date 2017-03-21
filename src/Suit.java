/**
 * Created by Cwolf on 3/21/17.
 */
public enum Suit {
    DIAMONDS("RED"),
    CLUBS("BLACK"),
    HEARTS("RED"),
    SPADES("BLACK");

    private String color;

    Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
