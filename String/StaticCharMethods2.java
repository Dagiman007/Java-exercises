import java.util.Scanner;

public class StaticCharMethods2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get radix
        System.out.println("Enter a radix:");
        int radix = scanner.nextInt();

        System.out.printf("Please choose one:\n1--%s\n2--%s\n",
            "Convert digit to character", "Convert character to digit");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter a digit: ");
                int digit = scanner.nextInt();
                System.out.println("Convert digit to character: " + Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.println("Enter a character:");
                char c = scanner.next().charAt(0);
                System.out.println("Convert character to digit: " + Character.digit(c, radix));
        }
    }
}
