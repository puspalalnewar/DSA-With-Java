package LinkedList;

import java.util.LinkedList;

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

    Node head = new Node(12);

    
    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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
        // list.insertNode(5);
        System.out.println(list.head.data);
        list.display();
    }
}
