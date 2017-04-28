package me.pavva.JavaJack;

public enum Suits {
    
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");
    
    private String suit;
    
    Suits(String suit_name) {
        this.suit = suit_name;
    }
    
    public String getSuit() {
        return this.suit;
    }
}
