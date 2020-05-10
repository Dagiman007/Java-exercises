import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] reversedArray = reverse(array);

        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Reversed array: ");
        System.out.println(Arrays.toString(reversedArray));
    }
    public static int[] reverse(int[] array){
        int[] reversedArray = new int[array.length];
        int j = 0;
        for(int i = array.length - 1;i >= 0 ; i--){
            reversedArray[j] = array[i];
            j++;
        }
        return reversedArray;
    }
}
