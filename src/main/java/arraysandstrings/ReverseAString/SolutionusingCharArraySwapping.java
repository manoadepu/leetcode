package arraysandstrings.ReverseAString;

public class SolutionusingCharArraySwapping {
    public static void main(String[] args){
        System.out.println(reverseString(args[0]));
    }
    public static String reverseString(String s){
        char[] charArray = s.toCharArray();
        int frontIndex=0;
        int lastIndex=charArray.length-1;
        while(frontIndex!=lastIndex && lastIndex>frontIndex){
            char front = charArray[frontIndex];
            char last = charArray[lastIndex];
            charArray[frontIndex] = last;
            charArray[lastIndex] = front;
            frontIndex++;
            lastIndex--;
        }
        return new String(charArray);
    }
}
