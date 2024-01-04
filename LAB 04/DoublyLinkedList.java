import java.util.Scanner;

public class DoublyLinkedList {

    public class Node {
        Node next,prev;
        int data;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    int num;

    public DoublyLinkedList() {
        this.head = null;
        this.num = 0;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertFirst() {
        System.out.println("Please Enter data to be inserted at first position: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node nn = new Node(data);
        if (head == null) {
            nn.prev = head;
            head = nn;
            num++;
        } else {
            nn.next = head;
            nn.prev = head;
            head.prev = nn;
            head = nn;
            num++;
        }
    }

    public void insertLast() {
        System.out.println("Please Enter data to be inserted at last position: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node nn = new Node(data);
        if (head == null) {
            nn.prev = head;
            head = nn;
            num++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            nn.prev = temp;
            temp.next = nn;
            num++;
        }
    }

    public void insertAtPos() {
        Node temp = head;
        System.out.println("Please enter position to insert:");
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        if (pos <= 0) {
            System.out.println("Zero and Negative positions doesn't exist");
        } else if (pos > num) {
            System.out.println("Position doesn't exist");
        } else if (pos == 1) {
            System.out.println("Please enter value to be inserted: ");
            int data = input.nextInt();
            Node nn = new Node(data);
            nn.next = head;
            nn.prev = head;
            head = nn;
            num++;
        } else {
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            System.out.println("Please enter value to be inserted: ");
            int data = input.nextInt();
            Node nn = new Node(data);
            nn.next = temp.next;
            (temp.next).prev = nn;
            temp.next = nn;
            nn.prev = temp;
            num++;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            (head.next).prev = head;
            head = head.next;
            num--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while ((temp.next).next != null) {
                temp = temp.next;
            }
            temp.next = null;
            num--;
        }
    }

    public void deletePos() {
        System.out.println("Please enter position to be deleted:");
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        if (pos <= 0) {
            System.out.println("Negative and Zero positions doesn't exist");
        } else if (pos > num) {
            System.out.println("position doesn't exist");
        } else if (pos == 1){
            (head.next).prev = head;
            head = head.next;
            num--;
        } else {
            Node temp = head;
            for( int i = 1; i <= pos - 1; i++){
                temp = temp.next;
            }
            if(pos == num){
                temp.next = null;
                num--;
                return;
            }
            (temp.next).prev =  temp.prev;
            (temp.prev).next = temp.next;
            num--;
        }
    }
    public void middleNode(){
        int middleNode = num/2;
        if(middleNode == 1){
            System.out.println("Middle node doesn't exist");
        } else{
            Node temp = head;
            for(int i = 1; i <= middleNode; i++){
                temp = temp.next;
            }
            System.out.println("Middle Node: " +temp.data);
        }
    }
    public void reverseTraverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        if(head == null){
            System.out.println("List is empty.");
        } else{
            System.out.print("null<=>");
            while(temp != head){
                System.out.print(temp.data +"<=>");
                temp = temp.prev;
            }
            temp = head;
            System.out.print(temp.data);
        }
    }
    public void search(){
        System.out.println("Please enter value to be searched");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        Node temp = head;
        int i = 0;
        while(temp != null){
            i++;
            if(temp.data == val){
                System.out.println("Value " +val +" is found at Node " +i);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }
    public void findMin() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        int min = temp.data;

        do {
            temp = temp.next;
            if (temp == null) {
                break; // Exit the loop if temp becomes null
            }
            if (min > temp.data) {
                min = temp.data;
            }
        } while (temp != head);

        System.out.println("Minimum Value: " + min);
    }
    public void findMax(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int max = temp.data;

        do{
            temp = temp.next;
            if(temp == null){
                break; //exiting loop if temp is null
            }
            if(max < temp.data){
                max = temp.data;
            }
        } while (temp != null);

        System.out.println("Maximum Value: " +max);
    }
    public void length(){
        System.out.println("Length of List: " +num);
    }

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
//        list.traverse();
        System.out.println("INSERT FIRST:");
        list.insertFirst();
        list.insertFirst();
        list.insertFirst();
        list.traverse();
        System.out.println("INSERT LAST:");
        list.insertLast();
        list.traverse();
        System.out.println("INSERT POSITION:");
        list.insertAtPos();
        list.traverse();
        list.length();
        System.out.println("MIDDLE NODE:");
        list.middleNode();
        System.out.println("DELETE FIRST:");
        list.deleteFirst();
        list.traverse();
        System.out.println("DELETE LAST:");
        list.deleteLast();
        list.traverse();
        System.out.println("DELETE POSITION:");
        list.deletePos();
        list.traverse();
        list.length();
        System.out.println("REVERSE TRAVERSING:");
        list.reverseTraverse();
        System.out.println("SEARCHING");
        list.search();
        list.search();
        System.out.println("MINIMUM");
        list.findMin();
        System.out.println("MAXIMUM");
        list.findMax();
    }
}
}
