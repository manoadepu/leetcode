package implementation.doublelinkedlist;

public class LinkedListDDemo {
    public static void main(String[] args){
        LinkedListD<String> LinkedListD = new LinkedListD<>();
        LinkedListD.add("manohar");
        LinkedListD.add("vijay");
        LinkedListD.add("ayn rand");
        LinkedListD.add("manoharadepu");
        LinkedListD.add("ram gopal varma");

        LinkedListD.display();
        System.out.println("-----after delete-----");
        LinkedListD.delete();
        LinkedListD.display();
    }
}
