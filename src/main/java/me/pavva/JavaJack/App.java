package me.pavva.JavaJack;

import java.util.*;

// import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Hand player = new Hand();
        Hand dealer = new Hand(); //Dealer's hidden card will be his first card (0th index)
        Deck deck = new Deck();

        Scanner sc = new Scanner(System.in);

        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            deck.deal(player);
            deck.deal(dealer);
        }

        System.out.println("Dealer is showing a " + dealer.getCard(1).getRank() + " of " + dealer.getCard(1).getSuit());

        while (player.getSum() <= 21) {
            System.out.println("You hands value is " + player.getSum() + ". Would you like to 'hit' or 'stay' ?");
            String choice = sc.next();

            if (choice.equals("hit")) {
                deck.deal(player);
                System.out.println("You drew a " + player.getCard(player.returnList().size() - 1).getRank() + " of "
                                   + player.getCard(player.returnList().size() - 1).getSuit());
            } else if (choice.equals("stay")) {
                break;
            } else if (player.getSum() > 21) {

                System.out.println("Oh no! You busted! Dealer wins.");

            } else {
                sc.close();
                throw new IllegalArgumentException("That\'s not an answer");
            }
        }

        if (player.getSum() > 21) {
            System.out.println("Oh no! You busted! Dealer wins.");
            sc.close();
            System.exit(0);
        }

        System.out.println("The dealer's hidden card was " + dealer.getCard(0).getValue() + " of " + dealer.getCard(0).getSuit());
        System.out.println("The dealer's total value is " + dealer.getSum());


        while (dealer.getSum() <= 21) {


            if (dealer.getSum() > 17) {
                break;
            } else if (dealer.getSum() <= 16) {
                deck.deal(dealer);
                System.out.println("Dealer hits. He drew a " + dealer.getCard(dealer.returnList().size() - 1).getRank() + " of "
                                   + dealer.getCard(dealer.returnList().size() - 1).getSuit());
            }

            if (dealer.getSum() > 21) {
                System.out.println("You won! Dealer busted!\nDealer\'s total is " + dealer.getSum() + "\nYour total is " + player.getSum());
                System.exit(0);
            }
        }
        
        
        if (dealer.getSum() >= player.getSum()) {
            System.out.println("Oh no! You lost.\nDealer\'s total is " + dealer.getSum() + "\nYour total is " + player.getSum());
        } else {
            System.out.println("You won!\nDealer\'s total is " + dealer.getSum() + "\nYour total is " + player.getSum());
        }
        
        
        sc.close();
        System.exit(0);
    }
}
