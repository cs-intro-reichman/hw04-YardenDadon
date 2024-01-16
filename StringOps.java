public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String input = args[0];
       // System.out.println(capVowelsLowRest(input));
      // System.out.println(camelCase(input));
      System.out.println(allIndexOf(input, 'l'));
    }

    public static String camelCase (String string) {
        String newString = "";
        boolean space = false;
        //Get rid of any spaces in the beginning
        for (int loop = 0; loop < string.length(); loop++){
            if (string.charAt(loop) == ' '){}
            else {newString += (string.charAt(loop));}
        }
        
        //If the first letter of newString is capital, lower it
      //  System.out.println(newString);
        for (int loop = 0; loop < newString.length(); loop++){
            if (upperVowel(newString, 0) == true || upperConstanant(newString, 0)) {
                newString += (char)(newString.charAt(0) - 32); 
            } else { 
                newString += newString.charAt(loop);
            }
        }


        //Starting from the second letter in newString, make them all lowercase until you hit a space
        //If you hit a space, skip that character and make the next letter upper case
       for (int loop = 1; loop < newString.length(); loop++){
        if (space == true) {}
            if ((upperVowel(newString, loop) == true || upperConstanant(newString, loop) == true) && space == false){
                        newString += (char)(newString.charAt(loop) + 32);
                    } else if (newString.charAt(loop) == ' '){
                        space = true;
                    } else if (space == true && (upperVowel(newString, loop) == true || upperConstanant(newString, loop) == true)){
                        newString += (newString.charAt(loop));
                    } else{
                        newString += (newString.charAt(loop));
                    }
                    space = false;
                }
        return newString;
    }














    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int loop = 0; loop < string.length(); loop++){
                if (lowerVowel(string, loop) == true){
                    newString += (char)(string.charAt(loop) - 32);
                } 
                else if (upperVowel(string, loop) == true){
                    newString += (string.charAt(loop));
                }
                else if (upperConstanant(string, loop) == true){
                    newString += (char)(string.charAt(loop) + 32); 
                }else {newString += (string.charAt(loop));}
            }
            return newString;
        }

    public static boolean lowerVowel(String string, int loop){
        if (string.charAt(loop) == 'a' || string.charAt(loop) == 'e' || string.charAt(loop) == 'i' ||string.charAt(loop) == 'o' 
        ||string.charAt(loop) == 'u') {
            return true;
        } else {return false;}
    }
    public static boolean upperVowel(String string, int loop){
        if (string.charAt(loop) == 'A' || string.charAt(loop) == 'E' || string.charAt(loop) == 'I' ||string.charAt(loop) == 'O' 
        ||string.charAt(loop) == 'U') {
            return true;
        } else {return false;}
    }
    public static boolean upperConstanant(String string, int loop){
        if (string.charAt(loop) >= 'A' && string.charAt(loop) <= 'Z' && upperVowel(string, loop) == false) {
            return true;
        } else {return false;}
    }

    public static boolean upperCase(String string, int loop, String string2, int loop2){
        if (upperConstanant(string, loop) == true || upperVowel(string2, loop2) == true){return true;}
        else {return false;}
    }


    public static int[] allIndexOf (String string, char chr) {
        int length = string.length();
        int[] output = new int[length];
        int indexInArray = 0;
        for (int loop = 0; loop < string.length(); loop++){
            if (string.charAt(loop) == chr){
                output[indexInArray] = loop;
                indexInArray++;
            }
        }
        return output;
    }

}