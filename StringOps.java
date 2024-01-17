public class StringOps {
    public static void main(String[] args) {
        String input = args[0];
       // System.out.println(capVowelsLowRest(input));
      System.out.println(camelCase(input));
      //System.out.println(allIndexOf(input, 'l'));
    }
////////////////////////////////////////////////////////////////////
    public static String camelCase (String string) {
        String newString = makeItLowerCase(string);
        String newString2 = correctCapitalLetters(newString);
        String newString3 = noSpaces(newString2);
        String newStringFinal = firstLetterSmall(newString3);
        //if loop - 1 == ' ' && lowerCase == true, make it upper case
          

            //remove all spaces
            //make first letter lower case (if not)
        return newStringFinal;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Custom made functions

    public static boolean lowerVowel(String string, int loop){//returns true if the character is a lower case vowel
        if (string.charAt(loop) == 'a' || string.charAt(loop) == 'e' || string.charAt(loop) == 'i' ||string.charAt(loop) == 'o' 
        ||string.charAt(loop) == 'u') {
            return true;
        } else {return false;}
    }
    public static boolean upperVowel(String string, int loop){//returns true if the character is a upper case vowel
        if (string.charAt(loop) == 'A' || string.charAt(loop) == 'E' || string.charAt(loop) == 'I' ||string.charAt(loop) == 'O' 
        ||string.charAt(loop) == 'U') {
            return true;
        } else {return false;}
    }
    public static boolean lowerConstanant(String string, int loop){//returns true if the character is an lower case constanant
        if (string.charAt(loop) >= 'a' && string.charAt(loop) <= 'z' && lowerVowel(string, loop) == false) {
            return true;
        } else {return false;}
    }
    public static boolean upperConstanant(String string, int loop){//returns true if the character is an upper case constanant
        if (string.charAt(loop) >= 'A' && string.charAt(loop) <= 'Z' && upperVowel(string, loop) == false) {
            return true;
        } else {return false;}
    }
    public static boolean upperCase(String string, int loop){//returns true if the character is an upper case vowel
        if (upperConstanant(string, loop) == true || upperVowel(string, loop) == true){return true;}
        else {return false;}
    }
    public static boolean lowerCase(String string, int loop){//returns true if the character lower case vowel
        if (lowerConstanant(string, loop) == true || lowerVowel(string, loop) == true){return true;}
        else {return false;}
    }
    public static String makeItLowerCase(String string){
        String newString = "";
        for (int loop = 0; loop < string.length(); loop++){
               if (upperVowel(string, loop) == true || upperConstanant(string, loop) == true){
                   newString += (char)(string.charAt(loop) + 32);
               }
               else { 
                   newString += string.charAt(loop);
               }
           }  
           return newString;
    }
    public static String correctCapitalLetters(String string){
        String newString = "";
        for (int loop = 0; loop < string.length(); loop++){
            if ((lowerVowel(string, loop) == true || lowerConstanant(string, loop) == true) && (loop > 0 && string.charAt(loop - 1) == ' ')){
                newString += (char)(string.charAt(loop) - 32);
          }else { 
                newString += string.charAt(loop);
           }
        }


        return newString;
    }
    public static String noSpaces(String string){
        String newString = "";
            for (int loop = 0; loop < string.length(); loop++){
                if (string.charAt(loop) == ' '){}
                else {newString += string.charAt(loop);}
            }
        return newString;
    }
    public static String firstLetterSmall(String string){
        String newString = "";
        for (int loop = 0; loop < string.length(); loop++){
            if (loop == 0 && (upperConstanant(string, 0) == true|| upperVowel(string, 0) == true)){
                newString += (char)(string.charAt(loop) + 32);
            }
            else {newString += string.charAt(loop);}
        }
        return newString;
    }
//////////////////////////////////////////////////////////////////////////////////////////
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

/////////////////////////////////////////////////////////////////////////////////////////////////
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
}