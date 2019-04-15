package ArraysAndStrings.implementation.linkedlist;

public class LinkedListDemo {

    public static void main(String[] args){
        LinkedListU<String> linkedListU = new LinkedListU<>();
        linkedListU.add("manohar");
        linkedListU.add("vijay");
        linkedListU.add("ayn rand");
        linkedListU.add("manoharadepu");
        linkedListU.add("ram gopal varma");

        linkedListU.display();
        System.out.println("-----after delete-----");
        linkedListU.delete();
        linkedListU.display();
    }
}
