public class CopyArray {
    public static void main(String[] args){
        int[] numbers = {3, 5, 90, 100, 56, 34, 12, 0, -17, 10};

        copyArray = copy(numbers);
        System.out.println("Array called numbers copied");


    }
    public static int[] copy(int[] numbers){
        int[] copy = new int[numbers.length];
        for(int i = 0;i < numbers.length;i++){
            copy[i] = numbers[i];
        }
	return copy
    }
}
