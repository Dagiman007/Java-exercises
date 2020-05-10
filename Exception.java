import java.util.Scanner;
import java.lang.Math;

public class Exception{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      double number = input.nextDouble();

      try{
          double squareRoot = findSqrt(number);
          System.out.printf("The square root of %f is %f", number, squareRoot);
      }catch(IllegalArgumentException e){
          System.out.println("Negative numbers don't have square root");
      }

    }
    public static double findSqrt(double number){
        if(number < 0){
            throw new IllegalArgumentException();
        }else{
            return Math.sqrt(number);
        }
      }
}
