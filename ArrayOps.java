public class ArrayOps {
    public static void main(String[] args) {
        int[] input1 = {1, 0, 3};
        System.out.println(findMissingInt(input1));
    }
    public static int findMissingInt (int [] array) {
        if (array.length == 1) {return 1;}
        int missingNumber = 0;
        for (int comparison = 0; comparison < array.length; comparison++) {
            boolean found = false;
            for (int indexValue = 0; indexValue < array.length; indexValue++) {
                if (array[indexValue] == comparison) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumber = comparison;
                break; 
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
