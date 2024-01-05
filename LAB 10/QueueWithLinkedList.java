public class QueueWithLinkedList {
    public class Node {

        Node next;
        int data;

        public Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    Node head;
    int count;

    public QueueWithLinkedList(){
        this.head = null;
        this.count = 0;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        } else{
            return false;
        }
    }
    public void enqueue(int data){
        Node nn = new Node(data);
        if(isEmpty()){
            head = nn;
            count++;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = nn;
            count++;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Can't Dequeue, Queue is empty.");
        } else{
            Node temp = head;
            head = head.next;
            count--;
            System.out.println("Dequeued: " +temp.data);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        } else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void average(){
        float sum = 0;
        Node temp = head;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("Average: " +sum);
    }

    public void max(){
        Node temp = head;
        int max = temp.data;
        while(temp.next != null){
            if((temp.next).data > max){
                max = (temp.next).data;
            }
            temp = temp.next;
        }
        System.out.println("Maximum Value: " +max);
    }
    public void min(){
        Node temp = head;
        int min = temp.data;
        while(temp.next != null){
            if((temp.next).data < min){
                min = (temp.next).data;
            }
            temp = temp.next;
        }
        System.out.println("Maximum Value: " +min);
    }
    public void search(int data){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
        } else{
            Node temp = head;
            int c = 1;
            while(temp != null){
                if(data == temp.data){
                    System.out.println("Value " +data +" found at node " +c);
                    return;
                } else{
                    c++;
                }
                temp = temp.next;
            }
        }
    }
    public void length(){
        System.out.println("Length of Queue: " + count);
    }
    public void peek(){
        System.out.println("Peeked Value: " +head.data);
    }
    public void even(){
        int i = -1;
        int[] even = new int[count];
        Node temp = head;
        while(temp != null){
            if((temp.data % 2) == 0){
               even[++i] = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Even Elements:");
        for(int j = 0; j <= i; j++){
            System.out.print(even[j] +" ");
        }
        System.out.println();
    }
    public void odd(){
        int i = -1;
        int[] odd = new int[count];
        Node temp = head;
        while(temp != null){
            if((temp.data % 2) != 0){
                odd[++i] = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Odd Elements:");
        for(int j = 0; j <= i; j++){
            System.out.print(odd[j] +" ");
        }
        System.out.println();
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

    public class Main {
        public static void main(String[] args) {
            QueueWithLinkedList queue = new QueueWithLinkedList();
            queue.display();
            queue.dequeue();
            queue.enqueue(5);
            queue.enqueue(4);
            queue.enqueue(3);
            queue.enqueue(2);
            queue.enqueue(1);
            queue.display();
            queue.dequeue();
            queue.display();
            queue.average();
            queue.max();
            queue.min();
            queue.search(3);
            queue.peek();
            queue.length();
            queue.even();
            queue.odd();
            queue.reverse();
            queue.display();
        }
    }

}
