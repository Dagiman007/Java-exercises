import java.util.Random;

public class Craps{
    private static final Random randomNumbers = new Random();

    //enumeration with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on the first roll
        Status gameStatus;

        int sumOfDice = rollDice(); // first roll of the dice

        switch(sumOfDice){
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember Point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice(); // roll dice again

            if(sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if(sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }
        if(gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");

    }
    public static int rollDice(){
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum );

        return sum;
    }
}
