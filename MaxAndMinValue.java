public class MaxAndMinValue {
    public static void main(String[] args){
        int[] numbers = {3, 5, 90, 100, 56, 34, 12, 0, -17, 10};

        System.out.println("Maximum number is : " + max(numbers));
        System.out.println("Minimum number is : " + min(numbers));
    }
    public static int max(int[] numbers){
        int maximumNumber = numbers[0];
        for(int i = 1;i < numbers.length;i++){
            if(numbers[i] > maximumNumber){
                maximumNumber = numbers[i];
            }
        }
        return maximumNumber;
    }
    public static int min(int[] numbers){
        int minimumNumber = numbers[0];
        for(int i = 1;i < numbers.length;i++){
            if(numbers[i] < minimumNumber){
                minimumNumber = numbers[i];
            }
        }
        return minimumNumber;
    }
}
