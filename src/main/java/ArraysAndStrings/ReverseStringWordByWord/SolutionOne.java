/*
    Question: Given an input string , reverse the string word by word.
    Input: ['t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e']
    Output: ['b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e']
 */

package ArraysAndStrings.ReverseStringWordByWord;

public class SolutionOne {
    static char[] outputArray;
    static int outputArrayIndex=0;
    public static void main(String[] args) {
        char[] wordsArray = new char[]{'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        outputArray = new char[wordsArray.length];
        String s = new String(wordsArray);
        reverseWords(wordsArray);
    }

    private static void reverseWords(char[] wordsArray) {

        int lastIndexOfWord = wordsArray.length - 1;
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                if (wordsArray[i] == ' ' && lastIndexOfWord != wordsArray.length - 1) {
                    writeWordsInReverseOrder(i + 1, lastIndexOfWord, wordsArray);
                    lastIndexOfWord = i - 1;
                }
                if (wordsArray[i] == ' ' && lastIndexOfWord == wordsArray.length - 1) {
                    writeWordsInReverseOrder(i + 1, wordsArray.length - 1, wordsArray);
                    lastIndexOfWord = i - 1;
                }
            } else {
                writeWordsInReverseOrder(0, lastIndexOfWord,wordsArray);
            }
        }
        System.out.println("Output array: " + new String(outputArray));
    }


    public static boolean writeWordsInReverseOrder(int firstIndexOfWords, int lastIndexOfWord, char[] wordsArray) {
        System.out.println("FirstIndex: " + firstIndexOfWords + "\tLastIndex: " + lastIndexOfWord);
        for(int i=firstIndexOfWords;i<=lastIndexOfWord;i++){
            outputArray[outputArrayIndex] = wordsArray[i];
            outputArrayIndex++;
        }
        if(outputArrayIndex<wordsArray.length-1)outputArray[outputArrayIndex] = ' ';
        outputArrayIndex++;
        System.out.println("OutputArrayIndexNextTime: " + outputArrayIndex);
        return true;
    }


}
