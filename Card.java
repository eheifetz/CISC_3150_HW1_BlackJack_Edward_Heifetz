public class Card {
    private String face;
    private String suit;
    
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return face + " of " + suit;
    }
    
    //Getter for Face
    public String getFace(){
    	return face;
    }
    
    //
	//Converts the face of a card into an integer value, Ace will always be 11
	//
	public int toInt (){
		if (face == "Ace"){
			return 11;
		}
		else if (face == "Deuce") {
			return 2;
		}
		else if (face == "Three") {
			return 3;
		}
		else if (face == "Four") {
			return 4;
		}
		else if (face == "Five") {
			return 5;
		}
		else if (face == "Six") {
			return 6;
		}
		else if (face == "Seven") {
			return 7;
		}
		else if (face == "Eight") {
			return 8;
		}
		else if (face == "Nine") {
			return 9;
		}
		else if (face == "Ten") {
			return 10;
		}
		else if (face == "Jack") {
			return 10;
		}
		else if (face == "Queen") {
			return 10;
		}
		else if (face == "King") {
			return 10;
		}
		else
			return 0;
	}
}