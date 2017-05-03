package me.pavva.JavaJack;

import org.junit.*;

public class CardTest {

    Card card = new Card(Suits.HEARTS, Ranks.TWO);

    @Test
    public void testGetSuit() {
        Assert.assertEquals(Suits.HEARTS.toString(), card.getSuit().toString().toUpperCase());
    }
    
    @Test
    public void testGetRank() {
        Assert.assertEquals("TWO", card.getRank().toUpperCase());
    }
    
    @Test
    public void testGetValue() {
        Assert.assertEquals(Ranks.TWO.getValue(), card.getValue());
    }

}
