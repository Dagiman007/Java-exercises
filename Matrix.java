import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int size = scanner.nextInt();
        printMatrix(size);
    }
    public static void printMatrix(int size){
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
