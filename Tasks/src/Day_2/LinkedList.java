package Day_2;

public class LinkedList {

    Node head = null;
    void addAtFirst(int data){
        Node ptr = new Node(data);
        if(head==null){
            head = ptr;
        }else{
            ptr.next = head;
            head = ptr;
        }
    }

    void addAtPosition(int pos,int data){
        Node ptr = new Node(data);
        Node temp = head;
        int idx = 0;
        while(temp.next!=null){
            if(idx==pos-1){
                ptr.next = temp.next;
                temp.next = ptr;
                break;
            }
            temp = temp.next;
            idx++;
        }
    }
    void addAtLast(int data) {

        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        }
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }




            temp.next = ptr;
        }
    }

    void deleteAtLast(){
        if(head == null){
            return;
        }
        Node temp = head,tail = null;
        while(temp.next!=null){
            tail = temp;
            temp = temp.next;
        }
        tail.next = null;
        temp = null;
    }

    void deleteAtFirst(){
        if(head == null){
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
    }

    void show() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
