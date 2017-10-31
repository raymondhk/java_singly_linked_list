class Node {
    public Integer value;
    public Node next;

    public Node () {
        this.value = null;
        this.next = null;
    }

    public Node (int val) {
        this.value = val;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = new Node();
    }

    public void add(int val) {
        if(this.head.value == null) {
            head.value = val;
            System.out.println(this.head.value);
        } else if(this.head.next == null) {
            this.head.next = new Node(val);
            System.out.println(this.head.next);
        } else {
            Node current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(val);
        }
    }

    public void remove() {
        if(this.head.next == null) {
            this.head = null;
        } else {
            Node current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void printValues() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    // public Integer getValue() {
    //     return this.head.value;
    // }
}