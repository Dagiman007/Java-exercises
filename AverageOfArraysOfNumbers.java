import java.util.Scanner;

public class AverageOfArraysOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int sizeOfNumbers = scanner.nextInt();

        int[] numbers = new int[sizeOfNumbers];

        System.out.println("Enter the numbers ");
        for (int i = 0; i < sizeOfNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The average is " + computeAverage(numbers));
    }
    public static double computeAverage(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }
        return (double)sum / (numbers.length);
    }
}
