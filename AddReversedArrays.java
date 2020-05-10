import java.util.Arrays;

public class AddReversedArrays{
    public static void main(String[] args) {
        int[] array1 = {2,4,3};
        int[] array2 = {5,6,4};

        int[] sum = addArrays(array1, array2);

        System.out.println(Arrays.toString(array1) + " + " +
                           Arrays.toString(array2) + " = " + Arrays.toString(sum));
    }

    public static int[] addArrays(int[] array1, int[] array2){
        int[] sum = new int[array1.length];

        for(int i = 0;i < array1.length;i++){
            sum[i] = array1[i] + array2[i];
            if(sum[i] >= 10){
                array1[i + 1] += 1;
                sum[i]  = sum[i] % 10;
            }
        }
        return sum;
    }
}
