package ArraysAndStrings.implementation;

public class DynamicArrayDemo {
    public static void main(String[] args){
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.put(1);
        System.out.println(dynamicArray.getSizse());
        dynamicArray.put(2);
        System.out.println(dynamicArray.getSizse());
        dynamicArray.put(3);
        System.out.println(dynamicArray.getSizse());
        dynamicArray.put(4);
        System.out.println(dynamicArray.getSizse());
    }
}