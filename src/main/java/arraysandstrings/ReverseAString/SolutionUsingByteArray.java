package arraysandstrings.ReverseAString;

public class SolutionUsingByteArray {
    public static void main(String[] args){
        System.out.println(reverseString(args[0]));
    }
    public static String reverseString(String s){
        byte[] byteArray = s.getBytes();
        byte[] byteArrayReverse = new byte[byteArray.length];

        for(int i=0; i<byteArray.length; i++){
            byteArrayReverse[i] = byteArray[byteArray.length-i-1];
        }
        return new String(byteArrayReverse);
    }
}
