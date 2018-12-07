package me.pavva.JavaJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>(52);

    public Deck() {

        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card c = new Card(s, r);
                cards.add(c);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card getCard(int index) {
        return this.cards.get(index);
    }

    public void deal(Hand targetPlayer) {
        targetPlayer.addCard(this.cards.get(0));
        this.cards.remove(0);
    }

    public void deal(Hand targetPlayer, int numberOfCards) {
        for (int i = 0; i <= numberOfCards; i++) {
            targetPlayer.addCard(this.cards.get(0));
            this.cards.remove(0);
        }
    }

    public void reset() {
        this.cards.clear();
        
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card c = new Card(s, r);
                cards.add(c);
            }
        }
    }
}
