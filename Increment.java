public class Increment{
    public static void main(String[] args) {
        int blueCars = 5;
        int greenCars = 10;

        int numCars = greenCars++ + blueCars + ++greenCars;

        System.out.println(numCars);
    }
}
