public class Node {
    private Object element;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object e, Node n) {
        element = e;
        next = n;
    }

    Object getElement() {
        return element;
    }

    void setElement(Object newElem) {
        element = newElem;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node newNext) {
        next = newNext;
    }

}