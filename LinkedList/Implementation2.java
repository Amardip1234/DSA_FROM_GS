package LinkedList;

public class Implementation2 {

    public static class LinkedList {
        Node head;
        Node tail;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            Node t = head;
            
            if (head == null) {
                head = temp;
                tail = temp;
                size++;
            }else{
                while (t.next != null) {
                    t = t.next; 
                }
                t.next = temp;
                tail = temp;
                size++;
            }
        }

        void insertAtBegin(int val){
            Node temp = new Node(val);
            Node t = head;
            if (t == null) {
                head = temp;
                tail = temp;
                size++;
            }else{
                temp.next = t;
                head = temp;
                size++;
            }
        }

        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        
        void insertAt(int idx, int val){
            Node temp = new Node(val);
            Node t = head;

            if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return;
            }else if(idx == size){
                insertAtEnd(val);
            }else if (idx == 0){
                insertAtBegin(val);
            }else{
                for(int i = 1; i< idx; i++){
                    t = t.next;
                }

                temp.next = t.next;
                t.next = temp;
                size++;
            }
        }

        void deleteAtIdx(int idx){
            Node t = head;
            if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
            }else{
                for(int i = 0; i<idx; i++){
                    
                }
            }
        }

    }

    public static class Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtBegin(1);
        ll.insertAt(0, 4);
        ll.insertAt(5, 6);
        ll.display();
        System.out.println();
        System.out.println("Head "+ll.head.data);
        System.out.println("Tail "+ll.tail.data);
        System.out.println("size is "+ll.size);

    }
}
