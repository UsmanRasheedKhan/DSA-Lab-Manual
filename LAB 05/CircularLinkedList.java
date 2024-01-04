import java.util.Scanner;

public class CircularLinkedList {

    public class Node {
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head,tail;
    int num;
    public CircularLinkedList(){
        this.num = 0;
        this.head = null;
        this.tail = null;
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.data +"->");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
        //System.out.println("head");
    }
    public void insertFirst(){
        try{
            System.out.println("Please enter value to be inserted: ");
            Scanner input = new Scanner(System.in);
            int data = input.nextInt();
            Node nn = new Node(data);
            if(head == null){
                head = nn;
                tail = nn;
                nn.next = head;
                num++;
                return;
            }
            nn.next = head;
            head = nn;
            tail.next = head;
            num++;
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void insertLast(){
        System.out.println("Please enter value to be inserted: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node nn = new Node(data);
        if(head == null){
            head =nn;
            tail = nn;
            nn.next = head;
            num++;
            return;
        }
        tail.next = nn;
        tail = nn;
        nn.next = head;
        num++;
    }
    public void insertPos(){
        System.out.println("Please enter position: ");
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        System.out.println("Please enter value to be inserted: ");
        int data = input.nextInt();
        Node nn = new Node(data);
        if(pos <= 0 || pos > num){
            System.out.println("Position doesn't exist");
        } else if(pos == 1){
            nn.next = head;
            head = nn;
            tail.next = head;
            num++;
        } else {
            Node temp = head;
            for(int i = 1; i < pos -1; i++){
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            num++;
        }
    }
    public void deleteFirst() {
        if (head == null) {
        System.out.println("List is empty");
        return;
        }
        head = head.next;
        tail.next = head;
        num--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while((temp.next).next != head){
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
        num--;
    }
    public void deletePos(){
        System.out.println("Please enter position to be deleted: ");
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(pos <= 0 || pos > num){
            System.out.println("Position doesn't exist");
        } else if(pos == 1){
            head = head.next;
            tail.next = head;
            num--;
        } else if(pos == num){
            Node temp = head;
            while((temp.next).next != head){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            num--;
        } else{
            Node temp = head;
            for(int i = 1; i < pos -1; i++){
                temp = temp.next;
            }
            temp.next = (temp.next).next;
            num--;
        }
    }
    public void search(){
        System.out.println("Please enter value to be searched: ");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        Node temp = head;
        int i = 0;
        while(temp.next != head){
            i++;
            if(temp.data == val){
                System.out.println("Value " +val +" found at Node " +i);
                return;
            }
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println("Value not found");
    }
    public void min(){
        Node temp = head;
        int min = temp.data;
        do{
            temp = temp.next;
            if(temp == head){
                break;      //exiting loop as list ends
            }
            if(min > temp.data){
                min = temp.data;
            }
        } while(temp != head);
        System.out.println("Minimum Value: " +min);
    }
    public void max(){
        Node temp = head;
        int max = temp.data;
        do{
            temp = temp.next;
            if(temp == head){
                break;          //exiting loop as list ends
            }
            if(max < temp.data){
                max = temp.data;
            }
        } while(temp != head);

        System.out.println("Maximum Value: " +max);
    }

public void reverse() {
    if (head == null) {
        return;
    }

    Node prev = null;
    Node current = head;
    Node nextNode;

    do {
        if(current == head) {
            break;
        }

        nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    } while (current != head);

    // Update the head to the new reversed head
    head = prev;
}
    public void length(){
        System.out.println("Length of list: " +num);
    }

    public class Main {
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
            list.insertFirst();
            list.insertFirst();
            list.insertFirst();
            list.insertFirst();
            list.traverse();
            list.length();
            list.insertLast();
            list.traverse();
            list.length();
            list.insertPos();
            list.traverse();
            list.length();
            list.deleteFirst();
            list.traverse();
            list.length();
            list.deleteLast();
            list.traverse();
            list.length();
            list.deletePos();
            list.traverse();
            list.length();
            list.search();
            list.min();
            list.max();
            list.reverse();
            list.traverse();
        }
    }
}
