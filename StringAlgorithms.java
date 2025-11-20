public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        String returnWord = "";
        for (int i = 0; i < word.length(); i++)
        {
            returnWord += word.substring(i,i+1) + "\n";
        }
        return returnWord;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        String returnWord = "";
        for (int i = word.length(); i > 0; i--)
        {
            returnWord += word.substring(i-1,i);
        }
        return returnWord;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        String returnSentence = "";
        boolean goUpper = true;
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.substring(i,i+1).equals(" "))
            {
               returnSentence += " ";
               goUpper = true;
            }
            else
            {
                if (goUpper == true)
                {
                  returnSentence += sentence.substring(i,i+1).toUpperCase();
                  goUpper = false;
                }
                else
                {
                  returnSentence += sentence.substring(i,i+1);
                }
            }
            
        }
        return returnSentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        String wordReverse = "";
        for (int i = word.length(); i > 0; i--)
        {
            wordReverse += word.substring(i-1,i);
        }
        if (wordReverse.equals(word))
        {
         return true;
        }
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        for (int i = 0; i < word.length(); i++)
        {
            String cutWord = word.substring(0,i) + word.substring(i+1);
            if (cutWord.indexOf(word.charAt(i)) == -1)
            {
               return word.charAt(i);
            }
        }
        return ' ';
        
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        System.out.println(firstUniqueChar("swiss"));
    }
}
