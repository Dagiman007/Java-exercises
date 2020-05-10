import java.util.Random;

public class DeckOfCards{
    private Card[] deck;  // array of Card Objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of cards
    // random number generator
    private static final Random randomNumbers = new Random();

    // Constructor fills deck of cards
    public DeckOfCards(){
        String[] faces = {"Ace","Deuce","Three","Four","Five", "Six",
                        "Seven", "Eight","Nine", "Ten","Jack","Queen","King"};
        String[] suits = {"Hearts", "Diamonds","Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // create array of card Objects
        currentCard = 0;
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13] , suits[count / 13]);
        }

    }
    public void shuffle(){
        // after shuffling dealing should start at deck[0] again
        currentCard = 0; // reinitialize the current card

        //for each card pick another random card and swap them
        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        // determine whether Cards remain to be dealt
        if(currentCard < deck.length){
            return deck[currentCard++]; // return current card in array
        }else{
            return null; // return null to indicate that all cards were dealt
        }
    }
}
