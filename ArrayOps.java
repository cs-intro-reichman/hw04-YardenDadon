public class ArrayOps {
    public static void main(String[] args) {
        int[] input1 = {4, 2, 0, 1, 3, 6};


        System.out.println(findMissingInt(input1));


    }
    
    public static int findMissingInt (int [] array) {
    if (array.length == 1){return 1;}
    int missingNumber = 0;
    for (int i = 0; i < array.length; i++){
        for (int j = 0; j < array.length; j++){
            if (array[j] != i){missingNumber = i;}
        }   
    }
    return missingNumber;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
