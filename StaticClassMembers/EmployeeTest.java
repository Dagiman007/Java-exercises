public class EmployeeTest{
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d\n",
                          Employee.getCount());

        Employee e1 = new Employee("John", "Doe");
        Employee e2 = new Employee("Jane", "Doe");

        System.out.println("\nEmployees after instantiation:");
        System.out.printf("Via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("Via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("Via Employee.getCount(): %d\n", Employee.getCount());

        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
                          e1.getFirstName(), e1.getLastName(),
                          e2.getFirstName(), e2.getLastName());

        // There is only one reference to each employee, so the following
        // two statements indicate that these objects are eligible for
        // garbage collection
        e1 = null;
        e2 = null;
    }
}
