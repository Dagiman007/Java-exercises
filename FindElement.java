import java.util.Scanner;

public class FindElement {
    public static void main(String[] args){
        int[] arr = {3, 5, 90, 100, 56, 34, 12, 0, -17, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number");
        int number = scanner.nextInt();

        if(findElement(arr, number)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static boolean findElement(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }
}
