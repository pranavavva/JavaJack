package me.pavva.JavaJack;

import java.util.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Hand player = new Hand();
        Hand dealer = new Hand();
        Deck deck = new Deck();
        
        Scanner sc = new Scanner(System.in);
        
        deck.shuffle();
        
        for (int i = 0; i < 2; i++) {
            deck.deal(player);
            deck.deal(dealer);
        }
        
        JFrame frame = new JFrame("JavaJack");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setVisible(true);
        
        
        while (player.getSum() <= 21) {
            System.out.println("You hands value is " + player.getSum() + ". Would you like to 'hit' or 'stay' ?");
        }
        
    }
}
