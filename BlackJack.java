import java.util.ArrayList;

public class BlackJack {
	private static final int WIN_CONDTION = 21;
	
	/// Players and Dealers can Bust if they draw two Aces, as Aces are a always worth 11
	public static void main(String[] args) {
		int dealerWorth, playerWorth = 0;
		DeckOfCards deck = new DeckOfCards ();
		deck.shuffle();
		Dealer dealer = new Dealer (deck);
		dealerWorth = dealer.judgeHand(deck);
		///TODO: Implement a way to show hand, possibly new method call, Implement Player, remove
		/// debug statements from dealer
	}
	
}