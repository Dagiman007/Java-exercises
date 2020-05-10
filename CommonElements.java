public class CommonElements {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 1, 5, 2, 7, 9, 9, 10};
        int[] array2 = {11, 12, 13, 1, 15, 2, 17, 19, 9, 20};

        findCommonElements(array1, array2);
    }
    public static void findCommonElements(int[] array1, int[] array2){
        System.out.print("Common elements are: ");
        for(int i = 0; i < array1.length;i++){
            for(int j = 0;j < array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
    }

}
