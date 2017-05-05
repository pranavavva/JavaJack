package me.pavva.JavaJack;

import org.junit.*;

public class DeckTest {
    
    Deck deck = new Deck();
    Hand hand =  new Hand();
    
    @Test
    public void testShuffle() {
        Card card1 = deck.getCard(0);
        deck.shuffle();
        Card card2 = deck.getCard(0);
        
        Assert.assertNotEquals(card1, card2);
    }
    
    @Test
    public void testDeal() {
        Card cardDeck1 = deck.getCard(0);
        deck.deal(hand);
        
        Assert.assertEquals(cardDeck1, hand.getCard(0));
    }
    
    @Test
    public void testReset() {
        
        Deck deck = new Deck();
        
        Card deckCard1 = deck.getCard(0);
        deck.reset();
        Assert.assertEquals(deckCard1.getValue(), deck.getCard(0).getValue());
        Assert.assertEquals(deckCard1.getRank(), deck.getCard(0).getRank());
        Assert.assertEquals(deckCard1.getSuit(), deck.getCard(0).getSuit());
    }
}
