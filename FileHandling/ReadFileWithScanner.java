import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file name to read: ");
        String fileName = scanner.next();

        try{
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNext()){
                String firstName = input.next();
                String lastName = input.next();
                double rating = input.nextDouble();
                System.out.printf("%s %s %.2f\n", firstName, lastName, rating);
            }

        }catch(FileNotFoundException fileNotFoundException){
            System.err.println("File not found.");
            System.exit(1);
        }
    }

}
