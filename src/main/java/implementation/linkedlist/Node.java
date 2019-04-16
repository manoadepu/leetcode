package implementation.linkedlist;

public class Node {
    public Object value;
    public Node referenceToNextElement;

    public Node(Object value, Node referenceToNextElement) {
        this.value = value;
        this.referenceToNextElement = referenceToNextElement;
    }
}
