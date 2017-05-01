package me.pavva.JavaJack;

public class App {

    public static void main(String[] args) {
        Hand player = new Hand();
        Hand dealer = new Hand();
        Deck deck = new Deck();
        
        deck.shuffle();
        
        for (int i = 0; i < 2; i++) {
            deck.deal(player);
            deck.deal(dealer);
        }
        
        for (Card c : player.returnList()) {
            System.out.println(c.getRank() + " of " + c.getSuit());
        }
        
        for (Card c : dealer.returnList()) {
            System.out.println(c.getRank() + " of " + c.getSuit());
        }
    }
}
