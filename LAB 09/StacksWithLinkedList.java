public class StacksWithLinkedList {

    public class Node {
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    int num;
    public StacksWithLinkedList(){
        this.head = null;
        this.num = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    public void push(int val){
        Node nn = new Node(val);
        if(isEmpty()){
            head = nn;
            num++;
        } else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = nn;
            num++;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Value can't be popped. Stack Underflow.");
            return;
        }
        Node temp = head;
        while((temp.next).next != null){
            temp = temp.next;
        }
        temp.next = null;
        num--;
    }
    public void isPeak(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Peaked Value: " +temp.data);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("top");
    }
    public void search(int val){
        Node temp = head;
        int i = 0;
        while (temp != null){
            i++;
            if(temp.data == val){
                System.out.println("Value " +val +" found at Node " +i);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found in stack");
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
            StacksWithLinkedList stack = new StacksWithLinkedList();
            stack.push(1);
            stack.push(2);
            stack.push(0);
            stack.push(9);
            stack.push(8);
            stack.push(6);
            stack.display();
            stack.pop();
            stack.display();
            stack.isPeak();
            stack.min();
            stack.max();
            stack.search(5);
            stack.reverse();
            stack.display();
            stack.average();
            stack.even();
            stack.odd();
        }
    }
}
