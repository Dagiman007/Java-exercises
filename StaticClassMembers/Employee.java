public class Employee{
    private String firstName;
    private String lastName;
    private static int count = 0;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee Constructor: %s %s; count = %d\n",
                          firstName, lastName, count);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public static int getCount(){
        return count;
    }
}
