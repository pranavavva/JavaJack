package me.pavva.JavaJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private ArrayList<Card> heldCards = new ArrayList<Card>();
    
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