package ArraysAndStrings.implementation.linkedlist;

public class LinkedListU<T> {
    Node head;

    public LinkedListU() {
        head =null;
    }

    //add an element to linked list
    public void add(Object value){
        Node newNode = new Node(value,null);
        //inserting first element
        if(head==null){
            head = newNode;
        }
        else{
            newNode.referenceToNextElement = head;
            head = newNode;
        }
    }

    //delete an element
    public void delete(){
        head = head.referenceToNextElement;
    }

    //print all elements in the linked list
    public void display(){
        Node n =head;
        while(n.referenceToNextElement != null){
            System.out.println((T)n.value);
            n = n.referenceToNextElement;
        }
    }
}
