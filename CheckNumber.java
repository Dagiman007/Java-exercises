class CheckNumber{
    public static void main(String[] args) {
        int[] array = {1,4,5, 6, 7, 89};
        int num1 = 3;
        int num2 = 7;

        System.out.println("Does 3 exist in array? " + checkIfNumberExists(num1, array));
        System.out.println("Does 7 exist in array? " + checkIfNumberExists(num2, array));
    }

    public static boolean checkIfNumberExists(int number, int[] array){
        for(int i = 0;i < array.length;i++){
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }
}
