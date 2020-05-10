import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int number3 = scanner.nextInt();

        System.out.print("The smallest number is ");
        System.out.println(computeAverage(number1, number2, number3));
    }
    public static double computeAverage(int number1, int number2, int number3){
        return (number1 + number2 + number3) / 3.0;
    }
}
