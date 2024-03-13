/*
 * Name: Bhanupriya Ambaji
 * LID: L20567850
 * Course: COSC:4304
 * Homework 5: Objects and Classes
 * Due Date: 10/16/2023
 * This program creates two deck of cards objects and draws 10 cards from each deck, printing them in two columns
 */

public class CardDeckTester {
    public static void main(String[] args) {
        // Create two decks of cards.
        DeckOfCards deck1 = new DeckOfCards();
        DeckOfCards deck2 = new DeckOfCards();

        // Print a header for the card drawing results.
        System.out.println("Deck 1\\t\\t\\t\\tDeck 2\"");
        System.out.println("---------------------------------");

        // Draw and display 10 pairs of cards from each deck.
        for (int i = 0; i < 10; i++) {
            // Draw a card from each deck and store its number.
            int cardNumber1 = deck1.drawCard();
            int cardNumber2 = deck2.drawCard();

            // Convert card numbers to human-readable card names and display them side by side.
            System.out.println(deck1.convertToCardName(cardNumber1) + " \t\t\t\t\t " + deck2.convertToCardName(cardNumber2));
        }

        // Shuffle both decks to reset them.
        deck1.shuffle();
        deck2.shuffle();
    }
}

