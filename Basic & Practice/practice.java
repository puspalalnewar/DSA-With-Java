class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class practice{

    Node head = null;

    
    
    // Insert at beginning
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print LL
    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice ll = new practice();
        practice newLL = new practice();
        ll.insertAtBeg(0);
        ll.insertAtBeg(1);
        // ll.insertAtEnd(0);
        // System.out.println(ll.head.data);
        // ll.printLL();
        newLL.insertAtBeg(20);
        System.out.println(newLL.head.data);

    }
}