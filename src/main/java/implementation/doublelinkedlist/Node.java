package implementation.doublelinkedlist;

public class Node {
    public Object value;
    public Node referenceToNextElement;
    public Node referenceToPreviousElement;

    public Node(Object value, Node referenceToNextElement, Node referenceToPreviousElement) {
        this.value = value;
        this.referenceToNextElement = referenceToNextElement;
        this.referenceToNextElement = referenceToPreviousElement;
    }
}
