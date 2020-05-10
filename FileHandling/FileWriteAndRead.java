import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteAndRead{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name to read: ");
        String infile = input.next();
        readFile(infile);

        System.out.println("\nEnter file name to write");
        String outfile = input.next();
        String[] lines = {"First line in duty!", "ANd the second goes here.", "Third here."};
        writeToFile(lines, outfile);

    }

    public static void readFile(String infileName){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(infileName));
            String line = br.readLine();
            while(line != null){
                System.out.println("--> " + line);
                line = br.readLine();
            }
        }catch(FileNotFoundException e){
            System.err.println("File not found.");
        }catch(IOException e){
            System.err.println("Error reading from file.");
        }
        if(br != null){
            try{
                br.close();
            }catch(IOException e){
                return;
            }
        }
    }

    public static void writeToFile(String[] lines, String outfileName){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(outfileName));
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }

        }catch(FileNotFoundException e){
            System.err.println("File not found.");
        }catch(IOException e){
            System.err.println("Error writing to file.");
        }
        if(bw != null){
            try{
                bw.close();
            }catch(IOException e){
                return;
            }
        }
    }
}
