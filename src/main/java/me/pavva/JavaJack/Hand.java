package me.pavva.JavaJack;

import java.util.List;
import java.util.ArrayList;

public class Hand {
    
    private List<Card> heldCards = new ArrayList<Card>();
    
    public void addCard(Card card) {
        this.heldCards.add(card);
    }
    
    public Card getCard(int index) {
        return this.heldCards.get(index);
    }
    
    public List<Card> returnList() {
        return this.heldCards;
    }
    
    public int getSum() {
        int sum = 0;
        for (Card c : this.heldCards) {
            sum += c.getValue();
        }
        
        return sum;
    }
}