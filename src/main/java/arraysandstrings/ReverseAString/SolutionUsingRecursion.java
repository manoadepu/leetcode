package ArraysAndStrings.ReverseAString;

public class SolutionUsingRecursion {
    public static void main(String[] args){
        String s =args[0];
        reverse(s);
    }

    public static void reverse(String s){
        if(s==null || s.length() <=1){
            System.out.print(s);
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            reverse(s.substring(0,s.length()-1));
        }
    }
}
