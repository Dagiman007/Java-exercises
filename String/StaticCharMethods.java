import java.util.Scanner;

public class StaticCharMethods{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = scanner.next();
        char c = input.charAt(0);

        System.out.println("is defined: " + Character.isDefined(c));
        System.out.println("is digit: " + Character.isDigit(c));
        System.out.println("is first character in a Java identifier: " + Character.isJavaIdentifierStart(c));
        System.out.println("is part of a java identifier: " + Character.isJavaIdentifierPart(c));
        System.out.println("is letter: " + Character.isLetter(c));
        System.out.println("is letter or digit: " + Character.isLetterOrDigit(c));
        System.out.println("is lower case: " + Character.isLowerCase(c));
        System.out.println("is upper case: " + Character.isUpperCase(c));
        System.out.println("to lower case: " + Character.toLowerCase(c));
        System.out.println("to upper case: " + Character.toUpperCase(c));
    }
}
