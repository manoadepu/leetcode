package ArraysAndStrings.ReverseAString;

public class SolutionUsingCharArray {
    public static void main(String[] args){
        System.out.println(reverseString(args[0]));
    }

    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int length = chars.length-1;
        String reverseString = new String();
        while(length>=0){
            reverseString = reverseString + chars[length];
            length--;
        }
        return reverseString;
    }
}
