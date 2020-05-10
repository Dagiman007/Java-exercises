import java.util.Random;

public class Limericks{
    public static void main(String[] args) {
        Random random = new Random();

        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};


        int count = 0;
        while(count++ < 20){
            String sentence = "";

            sentence += " " + articles[random.nextInt(5)];
            sentence += " " + nouns[random.nextInt(5)];
            sentence += " " + verbs[random.nextInt(5)];
            sentence += " " + prepositions[random.nextInt(5)];
            sentence += " " + articles[random.nextInt(5)];
            sentence += " " + nouns[random.nextInt(5)];

            String capitalized = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
            System.out.println(capitalized + ".");

        }
    }
}
