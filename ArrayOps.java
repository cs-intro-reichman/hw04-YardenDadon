public class ArrayOps {
    public static void main(String[] args) {
        int[] input = {-202, 48, 13, 7, 8};
        System.out.println(secondMaxValue(input));
    }


    public static int secondMaxValue(int [] array) {
        int highestNumber = 0;
        int secondHighest = 0;
        int temp = 0;
        for (int indexOfArray = 0; indexOfArray < array.length; indexOfArray++){
            if (array[indexOfArray] > highestNumber) {//6 > 0 //9 > 0 //4 > 9 <--- break
                temp = highestNumber; //temp = 0 // temp = 6
                highestNumber = array[indexOfArray]; // highest = 6 //highest = 9
                secondHighest = temp;// secondHighest = 0 // secondHighest = 6
                }
            for (int innerLoop = 0; innerLoop < array.length; innerLoop++){
                if (array[innerLoop] > secondHighest && array[innerLoop] != highestNumber){
                    secondHighest = array[innerLoop];
                }
            }
        }
        return secondHighest;
     } 




    public static int findMissingInt (int [] array) {
        //main issue was that missingNumber did not compute correctly for arrays without 
        //zero. Solution: assume that comparison is not in the array. If it it,
        //it flips a boolean and breaks out the loop. If it remains false until
        //the end, you got the missing number correctly.
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

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
