import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args){
        int[] arr = {3, 5, 90, 100, 56, 34, 12, 0, -17, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number");
        int number = scanner.nextInt();

        int index = findIndex(arr, number);
        if(index != -1){
            System.out.println("Number " + number + " is located at " + index);
        }else{
            System.out.println("Number not found");
        }
    }
    public static int findIndex(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
