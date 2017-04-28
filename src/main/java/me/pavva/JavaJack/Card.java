package me.pavva.JavaJack;

public class Card {
    
    private Suits suit;
    private Ranks rank;
    
    public Card(Suits suit_name, Ranks card_rank) {
        this.suit = suit_name;
        this.rank = card_rank;
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
