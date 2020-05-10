public class DuplicatedValues {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 1, 5, 2, 7, 9, 9, 10};

        findDuplicates(array);
    }
    public static void findDuplicates(int[] array){
        System.out.print("Duplicate numbers are: ");
        for(int i = 0;i < array.length;i++){
            for(int j = i + 1;j < array.length;j++){
                if(array[i] == array[j]){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
