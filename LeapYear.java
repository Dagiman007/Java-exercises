import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        if(isLeapYear(year)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else if(year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}
