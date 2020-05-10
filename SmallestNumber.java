import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int number3 = scanner.nextInt();

        System.out.print("The smallest number is ");
        System.out.println(findSmallestNumber(number1, number2, number3));

    }
    public static int findSmallestNumber(int number1, int number2, int number3){
        if(number1 <= number2 && number1 <= number3){
            return number1;
        }else if(number2 <= number1 && number2 <= number3){
            return number2;
        }else{
            return number3;
        }
    }
}
