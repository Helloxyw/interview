package recursion;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/3/30
 * Time:21:21
 */
public class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
