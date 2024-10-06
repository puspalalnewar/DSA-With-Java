package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class reverseLL {

    Node head;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void revLinkedList(){
        Node ford = null;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            ford = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ford;
        }
        head = prev;
    }

    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.revLinkedList();
        list.printLL();
    }
}
