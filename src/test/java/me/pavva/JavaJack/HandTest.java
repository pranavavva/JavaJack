package me.pavva.JavaJack;

import org.junit.*;

public class HandTest {
    Hand hand = new Hand();
    Card card = new Card(Suits.HEARTS, Ranks.TWO);

    @Test
    public void testAddCard() {
        hand.addCard(card);
        Assert.assertEquals(card, hand.getCard(0));
    }
    
    @Test
    public void testReturnList() {
        hand.addCard(card);
        Assert.assertEquals(hand.returnList(), hand.returnList());
    }
    
    @Test
    public void testGetCard() {
        Card card2 = card;
        hand.addCard(card);
        Assert.assertEquals(card2.getRank(), hand.getCard(0).getRank());
    }
    
    @Test
    public void testSum() {
        hand.addCard(card);
        int valueExpected = card.getValue();
        int sum = hand.getSum();
        Assert.assertEquals(sum, valueExpected);
    }

}
