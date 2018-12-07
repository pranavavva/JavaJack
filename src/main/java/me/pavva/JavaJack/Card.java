package me.pavva.JavaJack;

public class Card {
    
    private Suits suit;
    private Ranks rank;

    public Card(Suits suitName, Ranks cardRank) {
        this.suit = suitName;
        this.rank = cardRank;
    }
    
    public String getSuit() {
        return this.suit.getSuit();
    }
    
    public String getRank() {
        return this.rank.toString();
    }
    
    public int getValue() {
        return this.rank.getValue();
    }
}
