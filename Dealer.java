import java.util.ArrayList;

public class Dealer {
	protected ArrayList<Card> hand = new ArrayList <Card> (2);
	
	public Dealer (DeckOfCards deck){
		hand.add(deck.dealCard());
		hand.add(deck.dealCard());
	}
	
	
	///
	///Adds a card to a dealers hand
	///
	public void addCard (Card card){
		hand.add(card);
		System.out.println("Dealer adds " + card.toString() + " to his hand");
	}
	
	///
	///
	///
	public int judgeHand (DeckOfCards deck){
		 ArrayList<Integer> value = new ArrayList <Integer> (2);
		 Boolean decided = false;
		 int index = 0;
		 int worth = 0;
		 while (decided == false) {
			 if (index < 2){
				 value.add((hand.get(index)).toInt());
				 index++;
			 }
			 else if (index == 2) {
				 System.out.println("Dealer has " + hand.get(0) + " and a " + hand.get(1));
				 if ((hand.get(0)).getFace()== "Ace" && (hand.get(1)).getFace() == "Ace") {
					 worth = 12;
				 }
				 else {
					 worth = value.get(0) + value.get(1);
				 }
				 if (worth > 15 && worth <22) {
					 System.out.println("Dealer has a total of " + worth + ".");
					 decided = true;
				 }
				 else if (worth < 16) {
					 hand.add(deck.dealCard());
					 System.out.println("Dealer has a worth of: " + worth + ", Dealer draws a " + hand.get(index) + ".");
					 value.add((hand.get(2)).toInt());
					 index++;
				 }
			 }
			 else {
				 worth += value.get(index-1);
				 if (worth > 15 && worth <22) {
					 System.out.println("Dealer has a total of " + worth + ".");
					 decided = true;
				 }
				 else if (worth > 21) {
					 System.out.println("Dealer Busts");
					 decided = true;
				 }
				 else if (worth < 16){
					 hand.add(deck.dealCard());
					 System.out.println("Dealer has a worth of: " + worth + ", Dealer draws a " + hand.get(index) + ".");
					 value.add((hand.get(index)).toInt());
					 index++;
				 }
			 }
		 }
		 return worth;
	}
}