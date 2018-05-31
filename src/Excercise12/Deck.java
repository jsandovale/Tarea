package Excercise12;

public class Deck {
	private Card[] cards;
	
	public Deck(int n) {
		cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
	}

}
