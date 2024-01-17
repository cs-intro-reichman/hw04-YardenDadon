public class ArrayOps {
    public static void main(String[] args) {
    //    int[] input1 = {1, -2, 3};
     //   System.out.println(isSorted(input1));
      //  int[] input2 = {2, 1};
    //    System.out.println(containsTheSameElements(input1, input2));
    }

    public static boolean isSorted(int [] array) {
        boolean increasingOrder = true;
        for (int index = 0; index < array.length - 1; index++){
            if (array[index] >= array[index + 1]) {increasingOrder = false;}
        }
        boolean decreasingOrder = true;
        for (int index = 0; index < array.length - 1; index++){
            if (array[index] <= array[index + 1]) {decreasingOrder = false;}
        }

       // System.out.println(increasingOrder + " " + decreasingOrder);
        if (increasingOrder == true || decreasingOrder == true) {return true;}
        else {return false;}
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        //Issue: Array would not continue to check all of its elements if the first few exist
        //Solution: Create a second set of loops comparing the second to the first and vice versa
        boolean inequality = true;
        for (int array1Index = 0; array1Index < array1.length; array1Index++) {
            inequality = true;
            for (int array2Index = 0; array2Index < array2.length; array2Index++) {
                if (array1[array1Index] == array2[array2Index]) {inequality = false; break;}
            }
            if (inequality) {return !inequality;}
        }

        for (int array2Index = 0; array2Index < array2.length; array2Index++) {
            inequality = true;
            for (int array1Index = 0; array1Index < array1.length; array1Index++) {
                if (array1[array1Index] == array2[array2Index]) {inequality=false;break;}
            }
            if (inequality) {return !inequality;}
        }
        return true;
    }

    public static int secondMaxValue(int [] array) {
        int highestNumber = 0;
        int secondHighest = 0;
        int temp = 0;
        for (int indexOfArray = 0; indexOfArray < array.length; indexOfArray++){
            if (array[indexOfArray] >= highestNumber) {//6 > 0 //9 > 0 //4 > 9 <--- break
                temp = highestNumber; //temp = 0 // temp = 6
                highestNumber = array[indexOfArray]; // highest = 6 //highest = 9
                secondHighest = temp;// secondHighest = 0 // secondHighest = 6
                }
            for (int innerLoop = 0; innerLoop < array.length; innerLoop++){
                if (array[innerLoop] >= secondHighest && array[innerLoop] != highestNumber){
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
}
