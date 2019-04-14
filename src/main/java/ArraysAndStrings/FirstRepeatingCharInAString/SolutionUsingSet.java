package ArraysAndStrings.FirstRepeatingCharInAString;

import java.util.HashSet;
import java.util.Set;

public class SolutionUsingSet {
    public static void main(String[] args){
        String firstUniqueChar = args[0];
        Set<Character> set = new HashSet<Character>();
        int length=0;
        boolean unique = true;
        while(length<=firstUniqueChar.length()) {
            if(set.add(firstUniqueChar.charAt(length))) {
                unique=false;
                break;
            };
            length++;
        }
        System.out.println("First character thats repeating:"+ firstUniqueChar.charAt(length));
    }
}
