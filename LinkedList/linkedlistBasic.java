package LinkedList;

// Node class to represent each element in the LinkedList
class Node{
    int data;
    Node next;

    // Constructor to initialize node
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class linkedlistBasic {
    
    Node head = null;

    // Insert At Beginning
    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert At End
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    // Insert At specific position
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 1; temp != null && i<position-1; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode; // If we take the exaple of 3 nodes(1->2->3->null) and I want to insert the newNode into the 3rd position. At that time (temp.next) is the orginal 3rd nodes position.
    }

    // Delete from Beginning
    public void deleteNode(int key){
        Node temp = head, prev = null;
        if(temp!= null && temp.data == key){
            head = temp.next;
            return;
        }
        while (temp!=null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found in the list.");
            return;
        }
        prev.next = temp.next;
    }

    // Print LinkedList
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlistBasic list = new linkedlistBasic();
        list.insertNode(5);
        list.insertNode(4);
        list.insertNode(3);
        list.insertNode(2);
        list.insertNode(1);
        list.insertAtEnd(6);
        list.insertAtPosition(0, 1);
        list.insertAtPosition(0, 1);
        list.insertAtPosition(15, 1);
        // System.out.println(list.head.data);
        list.deleteNode(15);
        list.deleteNode(0);
        list.display();
    }
}
