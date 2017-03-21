import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CardTest {

    @Test

    /**
     * Given a face down card
     * When card is flipped
     * Then card is face up
      */
    
//    Properties(suit, value, flip(), isFaceCard boolean, 

    public void whenCardFlippedThenIsFaceUp(){
        //Arrange
        Card card = new Card(Suit.SPADES, Rank.KING, false);
        //Act
        boolean flip = card.flip();
        //Assert
        assertThat(flip, equalTo(true));
    }

    @Test
    /**
     * Given a face up card
     * When card is flipped
     * Then card is face down
     */

    public void whenCardFlippedThenIsFaceDown(){
        //Arrange
        Card card = new Card(Suit.SPADES, Rank.KING, true);
        //Act
        boolean flip = card.flip();
        //Assert
        assertThat(flip, equalTo(false));
    }

    @Test
    /**
     * Given a rank of two
     * When
     * Then card is a number
     */

    public void whenCardRankTwoThenCardIsNumber(){
        // Arrange
        Card card = new Card(Rank.TWO, true);
        // Act (I do not think we are doing this correctly (referencing problem))
        int rank = Rank.TWO.getNums();
        // Assert
        assertThat(rank,equalTo(2));
    }

    @Test
    /**
     * Given a suit of Spades
     * When
     * Then card is black
     */

    public void whenCardSuitSpadesThenCardIsBlack (){
        //Arrange
        Card card = new Card(Suit.SPADES, Rank.KING, true);
        //Act
        String color = Suit.SPADES.getColor();
        //Assert
        assertThat(color, equalTo("BLACK"));
    }
}
