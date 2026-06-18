package insertionSort;

import java.util.Arrays;

public class InsertionSort {
	
	// Create a method to sort playing cards using insertion sort
	public static void sortCards(int[] cards) {
		
		// Loop through the array of cards starting at index 1
		for (int card = 1; card < cards.length; card++) {
			
			// Save the current card that needs to be inserted into the sorted portion
			int cardToSort = cards[card];
			
			// The portion of the array from index 0 through sorted is already sorted
			int sorted = card - 1;
			
			// Loop through to see if the sorted card is in the position
			// greater than or equal to index 0 and also compare the value
			// of the card in the sorted position with the value of the card to sort
			while (sorted >= 0 && cards[sorted] > cardToSort) {
				
				// Since the card value of the card to sort is saved in cardToSort
				// shift the larger sorted card one position to the right temporarily
				// making both indexes the same value making room for smaller card to be inserted
				cards[sorted + 1] = cards[sorted];
				
				// Decrement the position of the sorted card to move backward through the sorted portion
				sorted = sorted - 1;
			}
			
			// When the conditions in the while loop evaluate to false
			// place cardToSort into the space created by shifting the larger cards
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
