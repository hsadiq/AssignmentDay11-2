package com.bl;

public class DeckOfCard {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];

        // Initialize the deck of cards
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
            }
        }

        // Shuffle the deck of cards
        for (int i = deck.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            String temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }

        // Distribute the cards to 4 players
        String[][] players = {new String[9], new String[9], new String[9], new String[9]};
        int cardIndex = 0;
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        // Print the cards received by the players
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + " received:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
