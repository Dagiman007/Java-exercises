import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        System.out.println("The sum of digits is " + sumDigits(number));
    }
    public static int sumDigits(int number){
        int sum = 0;
        int remainder = number;
        int quotient;
        do{
            quotient = remainder % 10;
            sum += quotient;
            remainder /= 10;
        }while(remainder != 0);
        return sum;
    }
}

