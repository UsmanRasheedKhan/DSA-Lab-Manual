import java.util.Scanner;

public class SinglyLinkedList {

    public class Node {
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int num = 0;

        public void traverse(){
            Node temp = head;
            if(temp == null){
                System.out.println("List is Empty");
            } else{
                while(temp != null){
                    System.out.print(temp.data +" -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }

        public void insertFirst(){                  //Time Comp: O(1).
            System.out.println("Please enter data:");
            Scanner input = new Scanner(System.in);
            int data = input.nextInt();
            Node nn = new Node(data);
            nn.next = head;
            head = nn;
            num++;
            //System.out.println("Element Inserted at First Place in the List");
        }

        public void insertLast(int data) {
            Node nn = new Node(data);
            if(head == null){
                head = nn;
                num++;
            } else {
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = nn;
                num++;
            }
        }

        public void insertAtPosition(){                             //Time Complexity: O(n).
            System.out.println("Please enter position:");
            Scanner input = new Scanner(System.in);
            int pos = input.nextInt();
            System.out.println("Please enter data:");
            int data = input.nextInt();
            Node temp = head;
            if(pos <= 0){
                System.out.println("Negative & Zero positions doesn't exist");
                return;
            } else {
                for (int i = 1; i < pos - 1; i++) {
                    if (temp.next == null) {
                        System.out.println("List does not have position");
                        break;
                    } else {
                        temp = temp.next;
                        num++;
                    }
                }
            }
            Node nn = new Node(data);
            nn.next = temp.next;
            temp.next = nn;
            num++;
        }

        public void deleteFirst(){
            if(head == null){
                System.out.println("Can't delete because list is empty");
            } else{
                head = head.next;
                num--;
            }
        }

        public void deleteLast(){
            Node temp = head;
            while((temp.next).next != null){
                temp = temp.next;
            }
            temp.next = null;
            num--;
        }

        public void deleteAtPosition(int pos) {
            Node temp = head;
            if (pos <= 0) {
                System.out.println("Negative & Zero positions doesn't exist");
                return;
            } else {
                for (int i = 1; i < pos; i++) {
                    if (temp.next == null) {
                        System.out.println("List does not have position");
                        break;
                    } else {
                        //System.out.println(temp.data);
                        temp.next = (temp.next).next;
                        num--;
                    }
                }
            }
        }

        public void search(int data){
            Node temp = head;
            while(temp != null) {
                if (temp.data == data) {
                    System.out.println("Data is found in list");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Data is not found in the list");
            return;
        }

        public void reverse(){
            Node prev = null;
            Node temp = head;
            Node nextNode;

            while(temp != null){
                nextNode = temp.next;
                temp.next = prev;
                prev = temp;
                temp = nextNode;
            }
            head = prev;
        }

        public void middleNode(){
            if(head == null){
                System.out.println("null");
            }
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = (fast.next).next;
            }
            System.out.println("Middle Node: " +slow.data);
        }
    public void min(){
        Node temp = head;
        int min = temp.data;
        temp = temp.next;
        while(temp != null){
            if(min > temp.data){
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Minimum Value: " +min);
    }
    public void max(){
        Node temp = head;
        int max = temp.data;
        temp = temp.next;
        while(temp != null){
            if(max < temp.data){
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Maximum Value: " +max);
    }
    public void average(){
        float sum = 0;
        Node temp = head;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("Average: " +(sum/num));
    }
    public void even(){
        System.out.println("Even Numbers: ");
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                System.out.print(temp.data +"-->");
            }
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void odd(){
        System.out.println("Odd Numbers: ");
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 != 0){
                System.out.print(temp.data +"-->");
            }
            temp = temp.next;
        }
        System.out.println("end");
    }

    public class Main {
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            list.insertFirst();
            list.insertFirst();
            list.insertLast(4);
            list.insertAtPosition();
            list.traverse();
            list.search(3);
            list.even();
            list.average();
            list.max();
            list.min();
            list.middleNode();
            list.odd();
            list.reverse();
            list.traverse();
        }
    }
    
}
