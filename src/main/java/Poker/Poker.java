package Poker;

import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Poker {

    public static final int Number_of_cards = 52;
    int Number_of_players;

    private static String[] deck = new String[Number_of_cards];

    public static void main(String[] args) {
        createDeck();
        shuffleleDeck();
        serveCards();
    }

    private static void createDeck() {

        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[index++] = value + " of " + suit;

                if (suit.isEmpty()){
                    throw new IllegalArgumentException("No suites");
                }
                try {
                    System.out.println(Arrays.toString(suites));
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("No Desk");
                }




            }
        }
    }
    private static void shuffleleDeck(){
        Random random = new Random();

        for (int i=0; i<100; i++) {
            int in = random.nextInt(Number_of_cards);
            int out = random.nextInt(Number_of_cards);

            String tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;

        }
    }
    private static void serveCards() {
        int Number_of_players = 4;
        int index = 0;

        for (int round=1; round<=5; round++) {
            System.out.println("Round: " + round);


            for (int player=1; player<=Number_of_players; player++) {
                System.out.println("Player " + player + " gets: " + deck[index++]);
            }
            System.out.println("======================\n");

        }
    }
}
