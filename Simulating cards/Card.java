public class Card{
    private String face;  // face of the Card("Ace", "Deuce" ...)
    private String suit;  // suit of the card ("Hearts", "Diamonds")

    public Card(String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }

    // return String representation of Card
    public String toString(){
        return face + " of " + suit;
    }
}
