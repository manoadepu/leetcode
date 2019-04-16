package arraysandstrings.FirstUniqueCharInAString;

        import java.util.*;

public class SolutionUsingSet {
    public static void main(String[] args){
        Iterator iterator = getCharCountMap(args[0]).entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            if((Integer) entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public static Map<Character,Integer> getCharCountMap(String s){
        int i=0;
        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
        while(s.length()>i){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
            i++;
        }
        return map;
    }
}
