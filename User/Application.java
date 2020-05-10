import java.util.ArrayList;
import java.util.Scanner;

public class Application{
    public static ArrayList< User > users = new ArrayList<User>();

    public static void main(String[] args) {


        users.get(0).login("Dagi man", "Dagi");
        users.get(1).login("Jane Doe", "jane@12");
    }
    public static void signup(String username, String password){
      User user = new User(username, password);
      users.add(user);
    }
    public static void menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please enter correct choice")
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            choice = input.nextInt();
          }while(choice != 1 && choice != 2);


      System.out.print("Please enter username: ");
      String username = input.nextLine();
      System.out.print("Enter password: ");
      String password = input.nextLine();
      switch(menu()){
          case 1:
              signup(username, password);
              break;
          case 2:
              if(users.contains(username)){
                  int i = users.indexof(username);

              }
              login()
        }
    }

}
