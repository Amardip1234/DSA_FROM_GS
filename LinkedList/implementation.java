package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            int count = 0;
            Node temp = head;
            while (temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtBegin(int val){
            Node temp = new Node(val);
            if (head==null) {
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            
        }

        void insertAtIndex(int indx, int val){
            Node target = new Node(val);
            Node temp = head;
            if (indx == size()) {
                insertAtEnd(val);
                return;
            }else if(indx == 0){
                insertAtBegin(val);
                return;
            }else if(indx<0 || indx >size()){
                System.out.println("Wrong index");
                return;
            }
            for(int i = 0; i < indx-1; i++){
                temp = temp.next;
            }
            target.next = temp.next;
            temp.next = target;
            
        }

        int getElement(int idx){
            if(idx<0 || idx >size()){
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for(int i = 0; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx){
            Node temp = head;
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(12);
        ll.insertAtBegin(1);
        ll.insertAtBegin(9);
        ll.insertAtIndex(4, 10);
        ll.display();
        ll.deleteAtIdx(2);
        ll.display();
        System.out.println(ll.tail.data);
    }
}
