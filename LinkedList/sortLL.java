package LinkedList;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sortLL {

    Node head = null;

    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sortLL ll = new sortLL();
        ll.insertAtBeg(5);
        ll.insertAtBeg(4);
        ll.insertAtBeg(3);
        ll.insertAtBeg(2);
        ll.insertAtBeg(1);
        // System.out.println(ll.head.data);
        ll.printLL();
    }
}