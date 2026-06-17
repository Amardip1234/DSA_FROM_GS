package LinkedList;

import LinkedList.Implementation2.Node;

public class NthNodeQuestions {
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
            System.out.println();
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

        void GetNthElementFromEnd(int n){
            Node slow = head;
            Node fast = head;

            for(int i=1; i<=n;i++){
                fast = fast.next;
            }

            while (fast!=null){
                slow = slow.next;
                fast = fast.next;
            }

            System.out.println(slow.data);
        }
    
        void DeleteNthNodeFromEnd(int n){
            Node slow = head;
            Node fast = head;

            for(int i = 1; i<=n; i++){
                fast = fast.next;
            }
            if (fast==null) {
                head = head.next;
                return;
            }

            while (fast.next!=null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
        // ll.GetNthElementFromEnd(2);
        ll.DeleteNthNodeFromEnd(6);
        ll.display();
    }
}
