package LinkedList;

public class basicsll {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        
    }

    public static void display(Node a){
        Node temp = a;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        insertAtEnd(a, 10);
        display(a);
    }
}