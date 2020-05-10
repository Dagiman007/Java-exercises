import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();

        System.out.println("The area of the triangle is " + computeArea(side1, side2, side3));
    }
    public static double computeArea(double side1, double side2, double side3){
        double p = 0.5 * computePerimeter(side1, side2, side3);
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    public static double computePerimeter(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }
}
