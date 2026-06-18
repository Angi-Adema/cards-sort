package insertionSort;

import java.util.Arrays;

public class InsertionSort {
	
	// Create a method to sort playing cards using insertion sort
	public static void sortCards(int[] cards) {
		
		// Loop through the array of cards starting at index 1
		for (int card = 1; card < cards.length; card++) {
			
			// Set the card at index 1 equal to the one to sort
			int cardToSort = cards[card];
			
			// The card at index 0 is considered the sorted portion 
			int sorted = card - 1;
			
			// Loop through to see if the sorted card is in the position
			// greater than or equal to index 0 and also compare the value
			// of the card in the sorted position with the value of the card to sort
			while (sorted >= 0 && cards[sorted] > cardToSort) {
				
				// Since the card value at index 1 is saved in cardToSort
				// set both card values at index 0 and 1 equal to the sorted card value
				cards[sorted + 1] = cards[sorted];
				
				// Decrement the position of card j one position back
				sorted = sorted - 1;
			}
			
			// When the conditions in the while loop evaluate to false
			// set the value of the position one ahead of j equal to the card to sort
			cards[sorted + 1] = cardToSort;
		}
	}

	public static void main(String[] args) {
		
		// Array of cards to test the above logic
		int[] cards = {6, 2, 8, 9, 4, 7, 3, 10};
		
		// Call sortCards() passing in the array to sort the cards
		sortCards(cards);
		
		// Print the hand of sorted cards
		System.out.println(Arrays.toString(cards));
	}
}
