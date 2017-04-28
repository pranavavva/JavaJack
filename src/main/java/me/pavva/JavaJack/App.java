package me.pavva.JavaJack;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.getCard(i).getSuit() + "\t" + deck.getCard(i).getRank() + "\t" + deck.getCard(i).getValue());
        }
    }
}
